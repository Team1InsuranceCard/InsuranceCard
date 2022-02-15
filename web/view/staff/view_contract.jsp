<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@page
contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Insurance Card</title>
    <base href="${pageContext.servletContext.contextPath}/" />
    <link
      rel="icon"
      href="asset/image/favicon.png"
      type="image/png"
      sizes="16x16"
    />
    <link rel="stylesheet" href="asset/style/staff/view_contract.css" />
  </head>
  <body>
    <jsp:include page="../header_staff.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>

    <main>
      <div class="header">
          <h1 class="header__heading">Contract ${requestScope.contract.id}</h1>
        <div class="header__btn">
          <a class="btn btn--primary" href="staff/contract/renew?id=${requestScope.contract.id}">
            <img class="btn__icon" src="asset/image/staff/view_contract/icon_reload.png"></img>
            <div class="btn__text">Renew</div>
          </a>

          <a class="btn btn--danger" href="staff/contract/cancel?id=${requestScope.contract.id}">
            <img class="btn__icon" src="asset/image/staff/view_contract/icon_close.png"></img>
            <div class="btn__text">Cancel</div>
          </a>
        </div>
      </div>

      <div class="section">
        <h2 class="section__heading">General Information</h2>
        <div class="section__main">
          <div class="section__item">
            <div class="section__title">Contract ID</div>
            <div class="section__text">${requestScope.contract.id}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Status</div>
            <div class="section__text">${requestScope.contract.statusCode.statusName}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Product</div>
            <div class="section__text">${requestScope.contract.product.title}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Start Date</div>
            <div class="section__text">${requestScope.contract.startDate}</div>
          </div>
          
          <div class="section__item">
            <div class="section__title">Staff</div>
            <div class="section__text">${requestScope.contract.startStaff.firstName} ${requestScope.contract.startStaff.lastName}</div>
          </div>
          
          <div class="section__item">
            <div class="section__title">End Date</div>
            <div class="section__text">${requestScope.contract.endDate}</div>
          </div>
          
          <div class="section__item">
            <div class="section__title">Contract fee</div>
            <div class="section__text">${requestScope.contract.endDate}</div>
          </div>
        </div>
      </div>

      <div class="section">
        <h2 class="section__heading">Customer Information</h2>
        <div class="section__main">
          <div class="section__item">
            <div class="section__title">Name</div>
            <div class="section__text">${requestScope.contract.customer.firstName} ${requestScope.contract.customer.lastName}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Email</div>
            <div class="section__text">${requestScope.contract.account.email}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Date of Birth</div>
            <div class="section__text">${requestScope.contract.customer.dob}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Personal ID</div>
            <div class="section__text">${requestScope.contract.customer.personalID}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Phone</div>
            <div class="section__text">${requestScope.contract.customer.phone}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Address</div>
            <div class="section__text">${requestScope.contract.customer.address}</div>
          </div>
        </div>
      </div>

      <div class="section">
        <h2 class="section__heading">Vehicle Information</h2>
        <div class="section__main">
          <div class="section__left">
            <div class="section__item">
              <div class="section__title">Vehicle type</div>
              <div class="section__text">${requestScope.contract.customer.vehicleType}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">Engine</div>
              <div class="section__text">${requestScope.contract.customer.engine}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">License Plate</div>
              <div class="section__text">${requestScope.contract.customer.licensePlate}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">Color</div>
              <div class="section__text">${requestScope.contract.customer.color}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">Brand</div>
              <div class="section__text">${requestScope.contract.customer.brand}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">Owner</div>
              <div class="section__text">${requestScope.contract.customer.owner}</div>
            </div>
  
            <div class="section__item">
              <div class="section__title">Chassis</div>
              <div class="section__text">${requestScope.contract.customer.chassis}</div>
            </div>
          </div>
          
          <div class="section__right">
            <div class="section__item">
              <div class="section__title">Cert Image</div>
              <img class="section__img" src="${requestScope.contract.customer.certImage}"></img>
            </div>
          </div>          
        </div>
      </div>

      <div class="section">
        <h2 class="section__heading">Product Information</h2>
        <div class="section__main">
          <div class="section__item">
            <div class="section__title">Product ID</div>
            <div class="section__text">${requestScope.contract.product.id}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Product Title</div>
            <div class="section__text">${requestScope.contract.product.title}</div>
          </div>

          <div class="section__item">
            <div class="section__title">Content detail</div>
            <div class="section__text">${requestScope.contract.product.contentDetail}</div>
          </div>
        </div>
      </div>
    </main>

    <jsp:include page="../footer_full.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>
  </body>
</html>
