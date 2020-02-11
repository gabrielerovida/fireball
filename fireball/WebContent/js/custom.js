$(document).ready(
		function() {
			
			var base_url = $('base').attr('href');
				
			var counter = parseInt($('#counter').val());
			
			if(counter == 0) {
				$('#col_' + counter).fadeIn('fast');
				counter++;
			}
			
			$('.load-window').fadeOut('fast');
			
			$('.fix-height').css('height', $(this).height() - $('header').height()).removeClass('vh-100');
			
			
			
			$('.numeric').keypress(
					function(e) {
						var t = this;
						var key = e.keyCode || e.charCode;
						//alert(key);
						if(key < 48 || key > 57) {
							if(key != 44) {
								if(key != 46) {
									e.preventDefault();
									
									if($(t).hasClass('negative') && key == 45) {
										$(t).val($(t).val() + '-');
									}
									
								} else {
									e.preventDefault();
									$(t).val($(t).val() + ',');
								}
							} 
						}
					});
			
			
			
			
			$('#show-media-library').click(
					function() {
						var t = this;
						$('#media-library-modal').find('#media-library-frame').attr('src', base_url + 'media-library?c=' + $(t).data('category') + '&target=' + $(t).data('target'));
						$('#media-library-modal').modal('show');
					});

			

			
			
		});