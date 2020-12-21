feather.replace();

(function () {
    console.log("You are in main.js!");
})();

// Date format
jQuery(function ($) {
    var $datePicker = $('#datepicker');
    if ($datePicker.datepicker) {
        $datePicker.datepicker({format: 'yyyy-mm-dd'});
    }
    const $createForm = $('#createForm');
    if ($createForm.validate) {
        $createForm.validate({
            rules: {
                vat: {
                    required: true,
                    digits: true,
                    minlength: 9,
                    maxlength: 9
                },
                email: {
                    required: true,
                    email: true
                },
                password: {
                    required: true,
                    minlength: 4
                },
                userRole: {
                    required: true
                },
                firstName: {
                    required: true
                },
                lastName: {
                    required: true
                },
                city: {
                    required: true
                },
                street: {
                    required: true
                },
                streetNumber: {
                    required: true
                },
                postalCode: {
                    required: true,
                    minLength: 5,
                    maxLength: 5
                },
                phoneNumber: {
                    required: true
                },
                propertyType: {
                    required: true
                }
            },
            messages: {
                vat: {
                    required: "Vat is required.",
                    minlength: "Vat should be 9 digits.",
                    maxlength: "Vat should be 9 digits."
                },
                email: {
                    required: "Email is required.",
                    email: "This should be an email"
                },
                password: {
                    required: "Password is required.",
                    minlength: "Password should contain at least 4 characters."
                },
                userRole: {
                    required: "User Role is required."
                },
                firstName: {
                    required: "First Name is required."
                },
                lastName: {
                    required: "Last Name is required."
                },
                city: {
                    required: "City is required."
                },
                street: {
                    required: "Street is required."
                },
                streetNumber: {
                    required: "Street Number is required."
                },
                postalCode: {
                    required: "Postal Code is required.",
                    minLength: "Vat should be 5 digits.",
                    maxLength: "Vat should be 5 digits."
                },
                phoneNumber: {
                    required: "Phone Number is required."
                },
                propertyType: {
                    required: "Property Type is required."
                }
            }
        });
    }

    $('#modal').on('show.bs.modal', function (event) {
        const id = event.relatedTarget.dataset.id;
        $('#deleteForm').attr('action', `/admin/owner/${id}/delete`);
        $('.modal-title').text(function () {
            return `User #${id}`;
        });
    });
});