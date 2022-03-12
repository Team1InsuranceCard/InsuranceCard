<%-- 
    Document   : staff_manage
    Created on : Mar 8, 2022, 10:23:41 PM
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
        <base href="${pageContext.servletContext.contextPath}/">

        <style>
            body {
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
                    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
                color: #5C2941;
            }

            section {
                margin: 8rem 5rem 0 22rem;
            }

            section .title {
                margin-bottom: 1rem;
                margin-left: 5rem;
            }

            section .table {
                height: 20rem;
            }

            .table td {
                border-bottom: 0.5px solid #000000;
            }

            .table thead {
                background-color: rgba(255, 124, 140, 0.8);
                border: 1px solid #000000;
                border-radius: 10px;
            }

            .table tr:nth-child(even) {
                background-color: #FFF9EC;
            }

            .pagging {
                margin-top: 2rem;
                margin-bottom: 2rem;
                text-align: right;
            }

            .table .id {
                max-width: 4rem;

            }

            .table .name {
                max-width: 12rem;
            }

            .table .status {
                max-width: 4rem;
            }  

            .table .note, .method, .phone {
                max-width: 6rem;
            }

            .table .id, .status, .phone, .email {
                text-align: center;
                word-break: break-all;
            }

            .pagging .page {
                background: #FA7C7C;
                color: #FFFFFF;
                padding: 0.1rem 0.6rem;
                border-radius: 30px;
            }

            .pagging a, span {
                color: #000000;
                margin-left: 0.75rem;
            }

            sectin .row .btn {
                text-align: right;
            }
            
            .btn-add {
                background: #549bc8;
                color: #FFF9EC;
                border-radius: 10px;
                padding: 0.75rem 2rem;
                font-size: 18px;
            }
            
            .btn-add:hover {
                background-color: #2f5f7e;
                color: #FFFFFF;
                text-decoration: none;
            }
        </style>
    </head>

    <body>
        <header>
            <jsp:include page="../header_moderator.jsp">
                <jsp:param name="currentscreen" value="staff"/>
            </jsp:include>
        </header>

        <section>
            <div class="row">
                <h3 class="col-md-8 title">Manage Staff${requestScope.num}</h3>
                <div class="col-md-3 btn">
                    <a href="moderator/staff/create" class=" btn-add">
                        Add New Staff
                    </a>
                </div>
            </div>

            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col" class="id">ID</th>
                        <th scope="col" class="name">Name</th>
                        <th scope="col" class="status">Status</th>
                        <th scope="col" class="phone">Phone</th>
                        <th scope="col" class="email">Email</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="id">1</td>
                        <td class="name">Pham Thi Ngoc Anh</td>
                        <td class="status">~ Active</td>
                        <td class="phone">0123456789</td>
                        <td class="email">anhptnhs120426@fpt.edu.vn</td>
                    </tr>
                </tbody>
            </table>

            <div class="pagging" id="pagging">
            </div>

            <script>
                createPagger('customer/history/payment?${requestScope.date_page}', 'pagging',
                ${requestScope.pageIndex-1}, ${requestScope.pageIndex},
                ${requestScope.pageIndex+1}, 2, ${requestScope.totalPage});
            </script> 
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>
