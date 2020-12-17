(function () {
    $('#add-book').validate({
        rules: {
            vat: {
                required: true
            }
        },
        messages: {
            title: {
                required: 'Please add user vat.'
            }
        }
    });
})();