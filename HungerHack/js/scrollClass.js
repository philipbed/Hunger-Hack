/*!
 * scrollClass jQuery Plugin v1.0
 *
 * Author: Virgiliu Diaconu
 * http://www.virgiliu.com
 * Licensed under the MIT license.
 */
;(function ($, window, document, undefined) {
    'use strict';
    $.scrollClass = function (el, options) {
        var base = this;
        
        // Access to jQuery and DOM versions of element
        base.$el = $(el);
        base.el = el;
        
        // Cached objects 
        base.$win = $(window);
        base.$doc = $(document);
        
        var viewed = false,
            timer;
            
        // Initialize
        base.init = function () {
            base.options = $.extend({}, $.scrollClass.defaultOptions, options);
        };
        
        // Scroll handler
        base.scrollHandler = function () {
            // Return if element viewed        			
            if (viewed) {
                return;
            }
            if (base.options.delay && base.options.delay !== 0) {
                window.clearTimeout(timer);
                timer = window.setTimeout(base.onScroll, base.options.delay);
            } else {
                base.onScroll();
            }
        };
        
        // On scroll
        base.onScroll = function () {
            if (base.inViewport()) {
                var dataAttr = base.$el.data("scrollClass");
                base.$el.addClass(dataAttr);
                // Callback
                if (typeof base.options.callback === 'function') {
                    base.options.callback.call(el);
                }
                viewed = true;
                return;
            }
        };
        
        // If element visible in viewport
        base.inViewport = function () {
            var elRect = base.el.getBoundingClientRect(),
                thresholdNum = (base.options.threshold / 100) * elRect.height;
            return (
                elRect.top + thresholdNum <= base.$win.height() && elRect.bottom - thresholdNum >= 0 + base.options.offsetTop
            );
        };
        
        // Run initializer
        base.init();
        
        // On scroll listener	    
        base.$win.on('scroll', base.scrollHandler);
    };
    
    $.scrollClass.defaultOptions = {
        delay: 20,
        threshold: 50,
        offsetTop: 0
    };
    
    $.fn.scrollClass = function (options) {
        return this.each(function () {
            (new $.scrollClass(this, options));
        });
    };
})(jQuery, window, document);