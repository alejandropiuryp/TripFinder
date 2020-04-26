/**
 * 
 */
$(document).ready(function ($) {

	$('.mute-button').on('click tap touch', function() {
	    var $this = $(this);
	    if( $this.hasClass("MuteOn") ) {
	         // do mute off stuff
	         $this.removeClass("MuteOn").addClass("MuteOff");
	         clearInterval(MyTimer);
	    } else {
	         // do mute on stuff
	         $this.removeClass("MuteOff").addClass("MuteOn");
	         MyTimer = setInterval(moveRight, 3000);
	    }
	});
  
	var slideCount = $('#slider ul li').length;
	var slideWidth = $('#slider ul li').width();
	var slideHeight = $('#slider ul li').height();
	var sliderUlWidth = slideCount * slideWidth;
	
	$('#slider').css({ width: slideWidth, height: slideHeight });
	
	$('#slider ul').css({ width: sliderUlWidth, marginLeft: - slideWidth });
	
    $('#slider ul li:last-child').prependTo('#slider ul');

    function moveLeft() {
        $('#slider ul').animate({
            left: + slideWidth
        }, 200, function () {
            $('#slider ul li:last-child').prependTo('#slider ul');
            $('#slider ul').css('left', '');
        });
    };

    function moveRight() {
        $('#slider ul').animate({
            left: - slideWidth
        }, 200, function () {
            $('#slider ul li:first-child').appendTo('#slider ul');
            $('#slider ul').css('left', '');
        });
    };

    $('a.control_prev').click(function () {
        moveLeft();
    });

    $('a.control_next').click(function () {
        moveRight();
    });

});    
