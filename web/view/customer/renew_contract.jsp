<%-- 
    Document   : renew_contract
    Created on : Feb 9, 2022, 11:40:48 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="../../asset/style/customer/contract_information.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">
        
        <script>
            function renew() {
                if (confirm("You really want to renew this contract?") == true) {
                    document.getElementById("myForm").submit();
                }
            }
        </script>
    </head>
    <body>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </header>

        <section>
            <form id="myForm" action="customer/contract/renew" method="POST">
                <div class="product-label">
                    <div class="row">
                        <p class="col-md-8 label-title">PRODUCT TITLE</p>
                        <p class="col-md-4 label-fee">Fee: 5.000.000 VND</p>
                    </div>
                </div>

                <div class="customer-info">
                    <div class="cus title">
                        <p>Customer information</p>
                    </div>

                    <div class="cus-content">
                        <div class="row">
                            <p class="col-md-1 bold">Name:</p>
                            <p class="col-md-3 underline">Pham Thi Ngoc Anh</p>
                            <p class="col-md-1 space bold">DOB:</p>
                            <p class="col-md-2 underline">17/02/2001</p>
                        </div>
                        <div class="row">
                            <p class="col-md-1 bold">Phone:</p>
                            <p class="col-md-3 underline">0123456789</p>
                            <p class="col-md-1 space bold">PersonalID:</p>
                            <p class="col-md-2 underline">123456789123</p>
                        </div>
                        <div class="row">
                            <p class="col-md-1 bold">Address:</p>
                            <p class="col-md-5 underline">29/32 An Duong, Yen Phu, Tay Ho, Ha Noi</p>
                        </div>
                    </div>
                </div>

                <div class="contract-info">
                    <div class="contract title">
                        <p>Contract information</p>
                    </div>
                    <div class="contract-content">
                        <div class="row">
                            <p class="col-md-2 bold">Staff:</p>
                            <p class="col-md-3 underline">Do Phuong Loan</p>
                            <p class="col-md-2 space bold">Status:</p>
                            <p class="col-md-2 underline">Active</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Request date:</p>
                            <p class="col-md-3 underline">2022-01-17 15:05:23</p>
                            <p class="col-md-2 space bold">Resolve date:</p>
                            <p class="col-md-2 underline">2022-01-17 17:02:50</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Start date:</p>
                            <p class="col-md-3 underline">2022-01-17 15:05:23</p>
                            <p class="col-md-2 space bold">End date:</p>
                            <p class="col-md-2 underline">2022-01-17 17:02:50</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel request date:</p>
                            <p class="col-md-3 underline">2022-01-17 17:02:50</p>
                            <p class="col-md-2 space bold">Cancel date:</p>
                            <p class="col-md-2 underline">2022-01-17 17:02:50</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel reason:</p>
                            <textarea class="col-md-3 text-area" disabled></textarea>
                            <p class="col-md-2 space bold">Cancel comment:</p>
                            <textarea class="col-md-2 text-area" disabled></textarea>
                        </div>
                    </div>
                </div>

                <div class="vehicle-info">
                    <div class="vehicle title">
                        <p>Vehicle information</p>
                    </div>

                    <div class="vehicle-content">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="row">
                                    <p class="col-md-4 bold">Vehicle type:</p>
                                    <p class="col-md-6 underline">Sport</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Engine:</p>
                                    <p class="col-md-6 underline">5.0</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">License plate:</p>
                                    <p class="col-md-6 underline">99A-999.99</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Color:</p>
                                    <p class="col-md-6 underline">Black</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Brand:</p>
                                    <p class="col-md-6 underline">Honda</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Owner:</p>
                                    <p class="col-md-6 underline">Nguyen Van B</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Chassis:</p>
                                    <p class="col-md-6 underline">L172-SE151701</p>
                                </div>

                            </div>
                            <div class="col-md-6">
                                <p class="bold space">CertImage:</p>
                                <div class="row">
                                    <img class="col-md-12" src="asset/image/User Register.png" alt="cert image"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="product-info">
                    <div class="product title">
                        <p>Product information</p>
                    </div>

                    <div class="product-content">
                        <p>Điều 1: Quy định chung
                            Hợp đồng bảo hiểm (HĐBH): là văn bản thoả thuận giữa Bên A và Bên B cùng ký kết, theo đó Bên A phải đóng đủ phí bảo hiểm, Bên B phải bồi thường cho Bên A hoặc Người thụ hưởng khi xảy ra sự kiện bảo hiểm thuộc trách nhiệm bảo hiểm. Các tài liệu đính kèm HĐBH bao gồm:
                            Giấy yêu cầu bảo hiểm của Bên A (nếu có).
                            Quy tắc bảo hiểm.
                            Giấy chứng nhận Bảo hiểm.
                            Các Phụ lục HĐBH, Sửa đổi bổ sung và thỏa thuận khác bằng văn bản (nếu có).
                            Bảo hiểm bắt buộc TNDS của Chủ xe cơ giới: Theo Nghị định số 03/2021/NĐ-CP ban hành ngày 15/01/2021 của Chính phủ, Thông tư số 04/2021/TT-BTC ban hành ngày 15/01/2021 của Bộ Tài chính quy định về bảo hiểm bắt buộc TNDS của Chủ xe cơ giới và các văn bản hướng dẫn liên quan tại từng thời điểm.
                            Quy tắc bảo hiểm Tự nguyện Xe Ô Tô được ban hành theo Quyết định số 1855/QĐ-PVIBH ngày 30/12/2019 của Tổng giám đốc Tổng công ty Bảo hiểm PVI trên cơ sở chấp thuận của Bộ Tài Chính theo công văn 14569/BTC-QLBH ngày 22/11/2018 (sau đây gọi tắt là “Quy tắc”) loại hình bảo hiểm tự nguyện Bên A tham gia nêu tại Điều 3 của HĐBH và được đính kèm theo HĐBH.
                            Các Quy tắc, điều kiện, điều khoản hiện hành của Bảo hiểm PVI đồng thời được đăng tải trên website http://www.baohiempvi.com.vn
                            Các từ viết tắt, định nghĩa, điều khoản, điều kiện, điểm loại trừ bảo hiểm, giảm trừ bồi thường quy định trong trong Quy tắc bảo hiểm nêu trên có cùng ý nghĩa khi được sử dụng trong bản Hợp đồng này. Trường hợp nội dung của Quy tắc bảo hiểm và nội dung của HĐBH có sự khác nhau, thì nội dung của HĐBH sẽ được ưu tiên áp dụng.
                            Các thông tin về Xe tham gia bảo hiểm được kê khai đầy đủ, trung thực và chính xác trong Giấy yêu bảo hiểm và/hoặc trong bản Hợp đồng này là căn cứ để Bên B giải quyết bồi thường đúng quyền lợi cho Bên A khi xảy ra tổn thất thuộc phạm vi bảo hiểm, bao gồm và không giới hạn các quy định về giảm trừ số tiền bồi thường theo Quy tắc bảo hiểm do thông tin xe không đầy đủ, chính xác dẫn đến việc tính phí bảo hiểm không đầy đủ.
                            Trong trường hợp Bên A không thực hiện hoặc thực hiện không đầy đủ những quy định tại Quy tắc bảo hiểm và tại bản Hợp đồng này, Bên B có thể từ chối một phần hoặc toàn bộ số tiền bảo hiểm.
                            Bảo hiểm PVI đã triển khai ứng dụng PVI Mobile để hỗ trợ khách hàng thực hiện giám định các vụ tổn thất nhanh chóng, kịp thời theo hướng dẫn của Bảo hiểm PVI. Quý khách hàng có thể tải và cài đặt ứng dụng PVI Mobile tại kho ứng dụng App mobile (ISO) hoặc CH play (Android). Bảo hiểm PVI sẽ chi trả 100.000 VND cho mỗi lần Quý khách thực hiện thành công việc khai báo và giám định tổn thất qua App.
                            Trong mọi trường hợp, Bảo hiểm PVI không nhận bảo hiểm cho xe kinh doanh Taxi, xe cho thuê tự lái, Bên B không nhận bảo hiểm cho:
                            Xe taxi, xe cho thuê tự lái
                            xe Taxi Công nghệ (kinh doanh Grab hoặc các loại hình tương tự)
                            Xe khách liên tỉnh/ xe khách tuyến cố định/ Xe buýt liên tỉnh trên 29 chỗ
                            Xe giường nằm
                            Xe tải thường (thùng kín/ mui bạt v.v…) hoạt động tại khu vực công trường, khai trường, khu vực khai thác khoáng sản.
                        </p>

                        <p>Điều 2: Đối tượng tham gia bảo hiểm
                            Bên A đồng ý tham gia bảo hiểm và Bên B đồng ý nhận bảo hiểm cho xe ô tô thuộc sở hữu / quyền quản lý, sử dụng hợp pháp của Bên A
                        </p>

                        <p>Điều 3: Phạm vi bảo hiểm, điều kiện – điều khoản bảo hiểm, điều khoản loại trừ trách nhiệm bảo hiểm và phí bảo hiểm
                            [Bảo hiểm bắt buộc TNDS của Chủ xe cơ giới]
                            Phạm vi, điều kiện bảo hiểm: theo Quy tắc quy định tại Khoản 1.2 Điều 1 của HĐBH.
                            Phí bảo hiểm (bao gồm thuế GTGT):…………..đ
                            Bảo hiểm thiệt hại vật chất xe
                            Phạm vi, điều kiện bảo hiểm: theo Quy tắc quy định tại Khoản 1.3 Điều 1 của HĐBH
                            Giá trị xe: ….đ (Trong đó giá trị thiết bị lắp thêm: ………đ)
                            Số tiền bảo hiểm: …………………đ
                            Trường hợp nếu khách hàng tham gia Bảo hiểm dưới giá trị thì khi tổn thất thuộc phạm vi xảy ra, Bảo hiểm sẽ chi trả bồi thường theo tỷ lệ giữa Số tiền bảo hiểm và giá trị xe.
                            Mức khấu trừ:
                             500.000 đ/vụ tổn thất (Xe không kinh doanh vận tải)

                             1.000.000đ/vụ tổn thất (Xe kinh doanh vận tải)

                            Các điều khoản bổ sung Bên A lựa chọn tham gia để mở rộng phạm vi bảo hiểm:
                             ĐKBS 003/XCG-PVI: Bảo hiểm mất cắp bộ phận

                            Mức khấu trừ riêng   : 20% Số tiền bồi thường hoặc 2.000.000 đồng/vụ tổn thất, tùy số nào lớn hơn

                            Loại trừ :Điều khoản này không áp dụng cho chìa khóa/điều khiển điện của xe trong mọi trường hợp

                             ĐKBS 006/XCG-PVI: Không tính khấu hao phụ tùng, vật tư thay mới

                             ĐKBS 007/XCG-PVI: Lựa chọn cơ sở sửa chữa chính hãng

                             ĐKBS 008/XCG-PVI: Bảo hiểm thiệt hại động cơ do thủy kích

                            Mức khấu trừ riêng : Trường hợp tổn thất mà nhà sản xuất chỉ cung cấp toàn bộ tổng thành động cơ (không cung cấp riêng các bộ phận, chi tiết đơn lẻ). Bảo hiểm PVI chấp nhận giải quyết bồi thường có khấu trừ 10% số tiền bồi thường cho toàn bộ tổng thành động cơ phải thay thế (Sau khi đã tính khấu hao đối với trường hợp không tham gia 006/XCG-PVI) trên cơ sở có xác nhận về chính sách bán hàng của nhà sản xuất/ Các trường hợp khác : Bảo hiểm PVI sẽ áp dụng mức khấu trừ 20% số tiền bồi thường hoặc 3.000.000đ/vụ tổn thất, tùy thuộc vào số nào lớn hơn.

                            ĐKBS 009/XCG-PVI: Bảo hiểm cho xe trong thời gian chờ cấp đăng kiểm (360 giờ)
                            Phí bảo hiểm (bao gồm phụ phí và thuế GTGT)/năm:………………đ
                            [Bảo hiểm Tai nạn lái, phụ xe và tai nạn người ngồi trên xe ô tô:]
                            Phạm vi, điều kiện bảo hiểm: theo Quy tắc quy định tại Khoản 1.3 Điều 1 của HĐBH
                            Số chỗ ngồi tham gia bảo hiểm :…….. chỗ
                            Mức trách nhiệm bảo hiểm :……..tr.đ/người/vụ
                            Phí bảo hiểm (không tính thuế GTGT):………….. đ
                            Tổng phí bảo hiểm (bao gồm thuế GTGT): ………………đ
                            (Bằng chữ:….)

                            Các điểm loại trừ trách nhiệm bảo hiểm, giảm trừ bồi thường: áp dụng theo quy định tại Quy tắc bảo hiểm nêu tại Điều 1 của Hợp đồng này tương ứng với mỗi loại hình bảo hiểm quy định tại Điều 3 của Hợp đồng này.
                        </p>

                        <p>Điều 4: Thời hạn bảo hiểm
                            Thời hạn bảo hiểm: ……tháng, từ … giờ, ngày …/…/………     đến … giờ, ngày …/…/……..

                            Thời hạn bảo hiểm của Xe đồng thời được ghi trên Giấy chứng nhận bảo hiểm số ……………… ngày ……………….
                        </p>

                        <p>Điều 5: Phương thức và thời hạn thanh toán phí bảo hiểm
                            5.1.     Phương thức thanh toán: Chuyển khoản / Tiền mặt
                            5.2.     Thời hạn thanh toán:

                            [Phí bảo hiểm bắt buộc TNDS Chủ xe: thanh toán 1 lần tại thời điểm Bên B cấp Giấy chứng nhận bảo hiểm (theo quy định của Thông tư số 04/2021//TT-BTC của Bộ Tài chính ngày 15/01/2021).]
                            Phí bảo hiểm tự nguyện: Trước ngày …/…/…….
                            Lưu ý: Khách hàng cá nhân, khai thác trực tiếp: tối đa 5 ngày

                            Khách hàng cá nhân, khai thác qua Ngân hàng: tối đa 10 ngày

                            Khách hàng doanh nghiệp: tối đa 30 ngày.
                        </p>

                        <p>Điều 6: Quyền và trách nhiệm của các Bên
                            Quyền và Trách nhiệm của Bên A
                            Cam kết mọi thông tin liên quan đến xe được bảo hiểm của Bên A là chính xác và đã đọc, hiểu rõ, được tư vấn đầy đủ các nội dung Hợp đồng này, Quy tắc bảo hiểm, các điểm loại trừ bảo hiểm, giảm trừ bồi thường và điều khoản bổ sung nêu tại Hợp đồng này.
                            Tuân thủ các quy định của Quy tắc bảo hiểm, điều khoản bổ sung và các nội dung của Hợp đồng này.
                            Thanh toán phí bảo hiểm đầy đủ, đúng hạn theo Điều 5 của Hợp đồng này.
                            Thông báo ngay cho Bên B khi thay đổi bất kỳ các thông tin nào liên quan đến đối tượng được bảo hiểm (bao gồm nhưng không giới hạn các trường hợp thay đổi mục đích sử dụng, bộ phận hoặc thông số kỹ thuật nguyên bản của xe) ngay tại thời điểm thay đổi để Bên B xem xét điều chỉnh phí bảo hiểm phù hợp hoặc hướng dẫn các thủ tục cần thiết để đảm bảo quyền lợi bảo hiểm. Trường hợp Bên A không thông báo cho Bên B hoặc không nộp phí bổ sung (theo thông báo của Bên B) hoặc không thực hiện các thủ tục cần thiết theo hướng dẫn của Bên B, Bên B có quyền từ chối một phần hoặc toàn bộ số tiền bồi thường hoặc đơn phương chấm dứt Hợp đồng bảo hiểm này.
                            Thông báo ngay cho Bên B khi xảy ra tai nạn theo số Hotline 1900.54.54.58 ghi trên Giấy chứng nhận bảo hiểm để kịp thời phối hợp giải quyết và thực hiện theo đúng các hướng dẫn của Bên B. Trong vòng 05 ngày kể từ ngày xảy ra tổn thất, Bên A có nghĩa vụ gửi cho Bên B văn bản thông báo tai nạn (theo mẫu do Bên B cung cấp), trừ trường hợp bất khả kháng.
                            Tạo điều kiện và hỗ trợ cán bộ của Bên B tham gia giám định, tính toán thiệt hại khi có tổn thất xảy ra.
                            Có trách nhiệm cung cấp toàn bộ hồ sơ, chứng từ, tài liệu liên quan đến đối tượng bị tổn thất theo hướng dẫn của Bên B để Bên B có đủ cơ sở giải quyết bồi thường theo đúng Quy tắc và/hoặc quy định của pháp luật.
                            Thực hiện các quyền và nghĩa vụ khác theo quy định của Hợp đồng này và quy định pháp luật.
                            Quyền và trách nhiệm của Bên B
                            Cung cấp Quy tắc bảo hiểm, các điều khoản bổ sung mà Bên A tham gia, hướng dẫn giải thích những quy định về bảo hiểm cho Bên A.
                            Khi nhận được thông báo về tai nạn/tổn thất của Bên A, Bên B có trách nhiệm cử cán bộ đến hiện trường hoặc hướng dẫn Bên A thực hiện các công việc giải quyết ban đầu.
                            Khi nhận được thông báo của Bên A về việc thay đổi các thông tin liên quan đến đối tượng được bảo hiểm, Bên B sẽ xác nhận bằng văn bản cho Bên A về việc thay đổi phí bảo hiểm tương ứng mức phí theo quy định trong Biểu phí bảo hiểm của Bên B tại thời điểm cấp GCNBH hoặc hướng dẫn Bên A các thủ tục hủy bỏ Hợp đồng bảo hiểm đối với các rủi ro Bên B không nhận bảo hiểm.
                            Phối hợp kịp thời với Bên A để giám định thiệt hại, hướng dẫn Bên A hoặc người đại diện Bên A các thủ tục, giấy tờ lập hồ sơ yêu cầu bồi thường.
                            Xem xét, giải quyết và thanh toán tiền bảo hiểm cho tổn thất thuộc phạm vi bảo hiểm trong vòng 15 ngày làm việc kể từ ngày nhận được đầy đủ hồ sơ hợp lệ và không kéo dài quá 30 ngày làm việc trong trường hợp phải tiến hành xác minh hồ sơ (trừ trường hợp đặc biệt hoặc trường hợp bất khả kháng). Trường hợp phải xác minh hồ sơ, Bên B sẽ thông báo bằng văn bản cho Bên A biết trong vòng hai ngày làm việc kể từ khi Bên B nhận được đầy đủ hồ sơ hợp lệ.
                            [Thông báo bằng văn bản cho Ngân hàng thụ hưởng bảo hiểm khi có tổn thất được bồi thường theo quy định tại Điều 7 dưới đây và trong trường hợp Bên A hoặc Bên B đơn phương đề nghị chấm dứt Hợp đồng bảo hiểm hoặc Hợp đồng bảo hiểm tự động chấm dứt hiệu lực theo quy định của pháp luật khi Bên A không đóng phí bảo hiểm đầy đủ và đúng hạn.]
                            Thực hiện các quyền và nghĩa vụ khác theo quy định của Hợp đồng này và quy định pháp luật.
                        </p>

                        <p>Điều 7: Người thụ hưởng bảo hiểm
                            “Chủ xe / Người thừa kế hợp pháp:…………………………………..…”
                            “Ngân hàng: ………………………………………………………………….. theo Giấy xác nhận quyền thụ hưởng bảo hiểm đính kèm Hợp đồng này”
                        </p>

                        <p>Điều 8 : Chấm dứt hợp đồng bảo hiểm
                            Các quy định về chấm hợp đồng bảo hiểm áp dụng theo quy định tại Quy tắc bảo hiểm nêu tại Điều 1 của HĐBH này tương ứng với mỗi loại hình bảo hiểm quy định tại Điều 3 của HĐBH này.
                            Việc chấm dứt HĐBH này vì bất kỳ lý do nào sẽ không làm ảnh hưởng đến bất kỳ quyền, nghĩa vụ nào còn tồn đọng của các Bên phát sinh trước thời điểm chấm dứt HĐBH này.
                        </p>

                        <p>Điều 9: Điều khoản thi hành
                            Các bên đã đọc, hiểu và cam kết thực hiện đúng các điều khoản trong Hợp đồng này.
                            Hợp đồng này có hiệu lực kể từ ngày ký kết.
                            Nếu một trong hai Bên đề nghị sửa đổi nội dung của Hợp đồng này thì phải thông báo cho Bên kia bằng văn bản và hai Bên sẽ ký Phụ lục Hợp đồng để làm căn cứ thực hiện trừ một số trường hợp được quy định tại Hợp đồng này.
                            Hợp đồng bảo hiểm tự động chấm dứt hiệu lực hoặc được khôi phục hiệu lực theo thỏa thuận bằng văn bản giữa hai bên, phù hợp với các quy định tại Quy tắc bảo hiểm áp dụng và quy định của pháp luật.
                            Trong quá trình thực hiện Hợp đồng, nếu phát sinh tranh chấp, hai Bên sẽ cùng bàn bạc giải quyết trên cơ sở thương lượng. Nếu không giải quyết được bằng thương lượng, tranh chấp sẽ được đưa ra Tòa án có thẩm quyền để giải quyết theo quy định của pháp luật Việt Nam.
                            Các nội dung khác không được thỏa thuận tại Hợp đồng này sẽ áp dụng theo quy định của pháp luật Việt Nam.
                            Hợp đồng này được lập thành … bản có giá trị pháp lý như nhau và chỉ có hiệu lực khi được cấp cùng với Giấy chứng nhận bảo hiểm, mỗi bên giữ …. bản để cùng thực hiện.
                        </p>
                    </div>
                </div>
                <div class="submit">
                    <input type="button" value="Renew" onclick="renew()"/>
                </div>
            </form>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>
