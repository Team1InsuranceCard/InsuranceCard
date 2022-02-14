<%-- Document : product_detail Created on : Feb 14, 2022, 4:09:25 PM Author :
area1 --%> <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set value="${account.role}" var="role"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Insurance Card</title>
        <base href="${pageContext.servletContext.contextPath}/" />
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
            integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
            crossorigin="anonymous"
            />
        <link
            rel="icon"
            href="asset/image/favicon.png"
            type="image/png"
            sizes="16x16"
            />
        <link rel="stylesheet" href="asset/style/product_detail.css" />
        <style>
            main {
                <c:if test="${role}">
                    margin-left: 20em;
                </c:if>
                /* margin-left: 20em; */
                margin-top: 10em;
                margin-bottom: 10em;
            }
        </style>
    </head>
    <body>
        <c:choose>
            <c:when test="${role}">
                <jsp:include page="header_staff.jsp" />
            </c:when>
            <c:when test="${!role}">
                <jsp:include page="header_customer.jsp" />
            </c:when>
            <c:otherwise>
                <jsp:include page="header_common.jsp" />
            </c:otherwise>
        </c:choose>
        <main>
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="card mb-5 product-card">
                            <img
                                class="card-img-top"
                                src="${product.imageURL}"
                                alt="Card image cap"
                                />
                            <div class="card-body">
                                <h5 class="card-title">${product.title}</h5>
                                <p class="card-text">
                                    ${product.description}
                                </p>
                                <p class="product-update-time card-text">
                                    <small class="text-muted">Since <fmt:formatDate type="date" dateStyle="long" value="${product.startDate}"/></small>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="container">
                            <div class="row product-status">
                                <div class="col">
                                    <div class="status-title">
                                        <h2>Price</h2>
                                    </div>
                                    <div class="status-detail">
                                        <h3 class="product-price">${product.price}</h3>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="status-title">
                                        <h2>Status</h2>
                                    </div>
                                    <div class="status-detail">
                                        <c:if test="${product.statusCode.statusCode == 1}">
                                            <h3 style="color: #0DC858">Active</h3>
                                        </c:if>
                                        <c:if test="${product.statusCode.statusCode == 0}">
                                            <h3 style="color: #E02A2A">In-active</h3>
                                        </c:if>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="product-content">${product.contentDetail}
                                    Điều 1: Quy định chung Hợp đồng bảo hiểm (HĐBH): là văn bản
                                    thoả thuận giữa Bên A và Bên B cùng ký kết, theo đó Bên A phải
                                    đóng đủ phí bảo hiểm, Bên B phải bồi thường cho Bên A hoặc
                                    Người thụ hưởng khi xảy ra sự kiện bảo hiểm thuộc trách nhiệm
                                    bảo hiểm. Các tài liệu đính kèm HĐBH bao gồm: Giấy yêu cầu bảo
                                    hiểm của Bên A (nếu có). Quy tắc bảo hiểm. Giấy chứng nhận Bảo
                                    hiểm. Các Phụ lục HĐBH, Sửa đổi bổ sung và thỏa thuận khác
                                    bằng văn bản (nếu có). Bảo hiểm bắt buộc TNDS của Chủ xe cơ
                                    giới: Theo Nghị định số 03/2021/NĐ-CP ban hành ngày 15/01/2021
                                    của Chính phủ, Thông tư số 04/2021/TT-BTC ban hành ngày
                                    15/01/2021 của Bộ Tài chính quy định về bảo hiểm bắt buộc TNDS
                                    của Chủ xe cơ giới và các văn bản hướng dẫn liên quan tại từng
                                    thời điểm. Quy tắc bảo hiểm Tự nguyện Xe Ô Tô được ban hành
                                    theo Quyết định số 1855/QĐ-PVIBH ngày 30/12/2019 của Tổng giám
                                    đốc Tổng công ty Bảo hiểm PVI trên cơ sở chấp thuận của Bộ Tài
                                    Chính theo công văn 14569/BTC-QLBH ngày 22/11/2018 (sau đây
                                    gọi tắt là “Quy tắc”) loại hình bảo hiểm tự nguyện Bên A tham
                                    gia nêu tại Điều 3 của HĐBH và được đính kèm theo HĐBH. Các
                                    Quy tắc, điều kiện, điều khoản hiện hành của Bảo hiểm PVI đồng
                                    thời được đăng tải trên website http://www.baohiempvi.com.vn
                                    Các từ viết tắt, định nghĩa, điều khoản, điều kiện, điểm loại
                                    trừ bảo hiểm, giảm trừ bồi thường quy định trong trong Quy tắc
                                    bảo hiểm nêu trên có cùng ý nghĩa khi được sử dụng trong bản
                                    Hợp đồng này. Trường hợp nội dung của Quy tắc bảo hiểm và nội
                                    dung của HĐBH có sự khác nhau, thì nội dung của HĐBH sẽ được
                                    ưu tiên áp dụng. Các thông tin về Xe tham gia bảo hiểm được kê
                                    khai đầy đủ, trung thực và chính xác trong Giấy yêu bảo hiểm
                                    và/hoặc trong bản Hợp đồng này là căn cứ để Bên B giải quyết
                                    bồi thường đúng quyền lợi cho Bên A khi xảy ra tổn thất thuộc
                                    phạm vi bảo hiểm, bao gồm và không giới hạn các quy định về
                                    giảm trừ số tiền bồi thường theo Quy tắc bảo hiểm do thông tin
                                    xe không đầy đủ, chính xác dẫn đến việc tính phí bảo hiểm
                                    không đầy đủ. Điều 1: Quy định chung Hợp đồng bảo hiểm (HĐBH):
                                    là văn bản thoả thuận giữa Bên A và Bên B cùng ký kết, theo đó
                                    Bên A phải đóng đủ phí bảo hiểm, Bên B phải bồi thường cho Bên
                                    A hoặc Người thụ hưởng khi xảy ra sự kiện bảo hiểm thuộc trách
                                    nhiệm bảo hiểm. Các tài liệu đính kèm HĐBH bao gồm: Giấy yêu
                                    cầu bảo hiểm của Bên A (nếu có). Quy tắc bảo hiểm. Giấy chứng
                                    nhận Bảo hiểm. Các Phụ lục HĐBH, Sửa đổi bổ sung và thỏa thuận
                                    khác bằng văn bản (nếu có). Bảo hiểm bắt buộc TNDS của Chủ xe
                                    cơ giới: Theo Nghị định số 03/2021/NĐ-CP ban hành ngày
                                    15/01/2021 của Chính phủ, Thông tư số 04/2021/TT-BTC ban hành
                                    ngày 15/01/2021 của Bộ Tài chính quy định về bảo hiểm bắt buộc
                                    TNDS của Chủ xe cơ giới và các văn bản hướng dẫn liên quan tại
                                    từng thời điểm. Quy tắc bảo hiểm Tự nguyện Xe Ô Tô được ban
                                    hành theo Quyết định số 1855/QĐ-PVIBH ngày 30/12/2019 của Tổng
                                    giám đốc Tổng công ty Bảo hiểm PVI trên cơ sở chấp thuận của
                                    Bộ Tài Chính theo công văn 14569/BTC-QLBH ngày 22/11/2018 (sau
                                    đây gọi tắt là “Quy tắc”) loại hình bảo hiểm tự nguyện Bên A
                                    tham gia nêu tại Điều 3 của HĐBH và được đính kèm theo HĐBH.
                                    Các Quy tắc, điều kiện, điều khoản hiện hành của Bảo hiểm PVI
                                    đồng thời được đăng tải trên website
                                    http://www.baohiempvi.com.vn Các từ viết tắt, định nghĩa, điều
                                    khoản, điều kiện, điểm loại trừ bảo hiểm, giảm trừ bồi thường
                                    quy định trong trong Quy tắc bảo hiểm nêu trên có cùng ý nghĩa
                                    khi được sử dụng trong bản Hợp đồng này. Trường hợp nội dung
                                    của Quy tắc bảo hiểm và nội dung của HĐBH có sự khác nhau, thì
                                    nội dung của HĐBH sẽ được ưu tiên áp dụng. Các thông tin về Xe
                                    tham gia bảo hiểm được kê khai đầy đủ, trung thực và chính xác
                                    trong Giấy yêu bảo hiểm và/hoặc trong bản Hợp đồng này là căn
                                    cứ để Bên B giải quyết bồi thường đúng quyền lợi cho Bên A khi
                                    xảy ra tổn thất thuộc phạm vi bảo hiểm, bao gồm và không giới
                                    hạn các quy định về giảm trừ số tiền bồi thường theo Quy tắc
                                    bảo hiểm do thông tin xe không đầy đủ, chính xác dẫn đến việc
                                    tính phí bảo hiểm không đầy đủ.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <a role="button" href="#" class="btn btn-info btn-lg m-auto"
                       >Create Contract Now</a
                    >
                </div>
            </div>
        </main>
        <jsp:include page="footer_full.jsp" />
    </body>
</html>
