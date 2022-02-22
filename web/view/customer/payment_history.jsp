<%-- 
    Document   : payment_history
    Created on : Feb 22, 2022, 5:30:39 PM
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
        <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
        <base href="${pageContext.servletContext.contextPath}/">

        <style>
            section {
                margin: 10rem 8rem;
            }

            section .title {
                margin-bottom: 3rem;
                margin-left: 5rem;
            }

            .table td {
                max-width: 15rem;
            }
            
            .input-date {
                margin-left: 7rem;
            }
        </style>
    </head>
    <body>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="history"/>
            </jsp:include>
        </header>

        <section>
            <div class="row">
                <h3 class="col-md-5 title">Payment History</h3>
                <div class="col-md-5 input-date">
                    <input type="date" name="date"/>
                </div>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col" class="stt">STT</th>
                        <th scope="col" class="proTitle">Product title</th>
                        <th scope="col" class="amount">Amount</th>
                        <th scope="col" class="date">Start date</th>
                        <th scope="col" class="date">Paid date</th>
                        <th scope="col" class="method">Method</th>
                        <th scope="col" class="note">Note</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">4</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">5</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">6</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                    <tr>
                        <th scope="row">7</th>
                        <td>Bảo hiểm Bảo Việt cho xe 50cc trở xuống</td>
                        <td>300.000</td>
                        <td>11/05/2018 21:01:58</td>
                        <td>15/05/2018 21:01:58</td>
                        <td>Tiền mặt</td>
                    </tr>
                </tbody>
            </table>
            <div class="pagging">
                <span class="iconify" data-icon="codicon:triangle-left"></span>
                1
                2
                3
                <span class="iconify" data-icon="codicon:triangle-right"></span>
            </div>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>
