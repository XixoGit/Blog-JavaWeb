$(document).ready(function(){


		$('#registration-form').validate({
	    rules: {
	       name: {
	        required: true,
	       required: true
	      },
		  
	      ape: {
	    	  minlength: 6,
	    	  required: true
	      },

	      age: {
	    	  required: true,
	    	  required: true
	      },
	      tel: {
	    	  required: true,
	    	  required: true
	      },

	      city: {
	    	  required: true,
	    	  required: true
	      },
				      
		  agree: "required"
		  
	    },
			highlight: function(element) {
				$(element).closest('.control-group').removeClass('success').addClass('error');
			},
			success: function(element) {
				element
				.text('OK!').addClass('valid')
				.closest('.control-group').removeClass('error').addClass('success');
			}
	  });

}); // end document.ready