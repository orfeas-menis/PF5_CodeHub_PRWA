<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create Repair</h4>

<form id="createForm" action="/admin/repair/create" method="post">

    <div class="mb-3">
        <label for="vat">User VAT</label>
        <div class="input-group">
            <input type="text" class="form-control" id="vat" name="vat">
        </div>
    </div>

    <div class="mb-3">
        <label for="city">City</label>
        <div class="input-group">
            <input type="text" class="form-control" id="city" name="city">
        </div>
    </div>

    <div class="mb-3">
        <label for="postalCode">Postal Code</label>
        <div class="input-group">
            <input type="text" class="form-control" id="postalCode" name="postalCode">
        </div>
    </div>


    <div class="mb-3">
        <label for="street">Street</label>
        <div class="input-group">
            <input type="text" class="form-control" id="street" name="street">
        </div>
    </div>

    <div class="mb-3">
        <label for="streetNumber">Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="streetNumber" name="streetNumber">
        </div>
    </div>

    <div class="mb-3">
        <label for="description">Description</label>
        <div class="input-group">
            <input type="text" class="form-control" id="description" name="description">
        </div>
    </div>

    <div class="mb-3">
        <label for="category">Category</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="category" name="category">
                <#if categories??>
                    <#list categories as category>
                        <option value="${category}">${category}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="mb-3">
        <label for="status">Status</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="status" name="status">
                <#if statuses??>
                    <#list statuses as status>
                        <option value="${status}">${status}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>


    <div class="mb-3">

        <label for="datepicker">Date</label>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control" id="datepicker" name="dateTime">
        </div>
    </div>

    <div class="mb-3">
        <label for="cost">Cost</label>
        <div class="input-group">
            <input type="text" class="form-control" id="cost" name="cost">
        </div>
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>