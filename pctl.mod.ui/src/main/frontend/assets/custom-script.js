(function(){
                $('.new-list-view .list-view-item div:first-child').on('click', function(){
                                $(this).nextAll('section').toggle();
                });

                //smoothscroll
                $(window).scroll(function () { 
                   //   console.log($(window).scrollTop())
                    if ($(window).scrollTop() > 40) {
                      $('.nav-tabs').addClass('navbar-fixed');
                    }
                    if ($(window).scrollTop() < 40) {
                      $('.nav-tabs').removeClass('navbar-fixed');
                    }
                });


                $(document).on("scroll", onScroll);
    
    $('.nav-tabs a[href^="#"]').on('click', function (e) {
        e.preventDefault();
        $(document).off("scroll");
        
        $('.nav-tabs li').each(function () {
            $(this).removeClass('active');
        })
        $(this).parent().addClass('active');
      
        var target = this.hash,
            menu = target;
        $target = $(target);
        $('html, body').stop().animate({
            'scrollTop': $target.offset().top+2
        }, 500, 'swing', function () {
            window.location.hash = target;
            $(document).on("scroll", onScroll);
        });
    });


                function onScroll(event){
                    var scrollPos = $(document).scrollTop();
                    $('.nav-tabs a').each(function () {
                        var currLink = $(this);
                        var refElement = $(currLink.attr("href"));
                                          //      console.log(refElement);
                        if (refElement.position().top < scrollPos + 180 && refElement.position().top + refElement.height() > scrollPos + 180) {
                            $('.nav-tabs ul li').removeClass("active");
                            currLink.parent().addClass("active");
                        }
                        else{
                            currLink.parent().removeClass("active");
                        }
                    });
                }


                //tooltip code
                var changeTooltipPosition = function(event) {
                  var tooltipX = event.pageX - 8;
                  var tooltipY = event.pageY + 8;
                  $('div.custom-tooltip').css({top: tooltipY, left: tooltipX});
                };

                var showTooltip = function(event) {
                  $('div.custom-tooltip').remove();
                  $('<div class="custom-tooltip"><h5>SD-WAN BASIC</h5><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar tempor. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar tempor.</p></div>')
            .appendTo('body');
                  changeTooltipPosition(event);
                };

                var hideTooltip = function() {
                   $('div.custom-tooltip').remove();
                };

                $(".tool-trigger").bind({
                   mousemove : changeTooltipPosition,
                   mouseenter : showTooltip,
                   mouseleave: hideTooltip
                });
})();
