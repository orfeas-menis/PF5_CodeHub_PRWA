<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create User</h4>

<#if errorMessage??>
    <h2>${errorMessage}</h2>
</#if>

<form id="editForm" action="/admin/repair/edit" method="post">

    <input type="hidden" name="id" value="${repair.id}">

    <div class="mb-3">
        <label for="vat">User VAT</label>
        <div class="input-group">
            <input type="text" class="form-control" id="vat" name="vat" value="${vat}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>

    <div class="mb-3">
        <label for="city">City</label>
        <div class="input-group">
            <input type="text" class="form-control" id="city" name="city" value="${repair.city}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>

    <div class="mb-3">
        <label for="postalCode">Postal Code</label>
        <div class="input-group">
            <input type="text" class="form-control" id="postalCode" name="postalCode" value="${repair.postalCode}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>


    <div class="mb-3">
        <label for="street">Street</label>
        <div class="input-group">
            <input type="text" class="form-control" id="street" name="street" value="${repair.street}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>

    <div class="mb-3">
        <label for="streetNumber">Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="streetNumber" name="streetNumber"
                   value="${repair.streetNumber}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>

    <div class="mb-3">
        <label for="description">Description</label>
        <div class="input-group">
            <input type="text" class="form-control" id="description" name="description" value="${repair.description}">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        </div>
    </div>

    <div class="mb-3">
        <label for="category">Category</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="category" name="category">
                <#if categories??>
                    <#list categories as category>
                        <option value="${category}"<#if repair.category == category> selected</#if>>${category}</option>
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
                        <option value="${status}"<#if repair.status == status> selected</#if>>${status}</option>
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
            <input type="text" class="form-control" id="datepicker" name="dateTime" value="${repair.dateTime}">
        </div>
    </div>

    <div class="mb-3">
        <label for="cost">Cost</label>
        <div class="input-group">
            <input type="text" class="form-control" id="cost" name="cost" value="${repair.cost}">
        </div>
    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>