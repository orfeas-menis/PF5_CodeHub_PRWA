feather.replace();

(function () {
    console.log("You are in mainRepair.js!");
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
                description: {
                    required: true
                },
                category: {
                    required: true
                },
                status: {
                    required: true
                },
                dateTime: {
                    required: true
                },
                cost: {
                    required: true
                }
            },
            messages: {
                vat: {
                    required: "Vat is required.",
                    minlength: "Vat should be 9 digits.",
                    maxlength: "Vat should be 9 digits."
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
                description: {
                    required: "Description is required."
                },
                category: {
                    required: "Category is required."
                },
                status: {
                    required: "Status is required."
                },
                dateTime: {
                    required: "Date is required."
                },
                cost: {
                    required: "Cost is required."
                }
            }
        });
    }

    $('#modal').on('show.bs.modal', function (event) {
        const id = event.relatedTarget.dataset.id;
        $('#deleteRepairForm').attr('action', `/admin/repair/${id}/delete`);
        $('.modal-title').text(function () {
            return `Repair #${id}`;
        });
    });
});