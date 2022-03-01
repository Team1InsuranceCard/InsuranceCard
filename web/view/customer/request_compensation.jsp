<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Insurance Card</title>
        <link
            rel="icon"
            href="asset/image/favicon.png"
            type="image/png"
            sizes="16x16"
            />
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
            integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
            crossorigin="anonymous"
            />
        <link
            rel="stylesheet"
            href="asset/style/customer/request_compensation.css"
            />
    </head>
    <script src="//static.filestackapi.com/filestack-js/3.x.x/filestack.min.js"></script>
    <body>
        <jsp:include page="../header_customer.jsp">
            <jsp:param value="history" name="currentscreen" />
            <jsp:param value="compensation" name="currenthistory" />
        </jsp:include>

        <main>
            <div class="container">
                <div class="compensation-header"><h2>New Compensation</h2></div>
                <form>
                    <div class="row border rounded compensation-card">
                        <div class="title-card">
                            <h4 class="title-card-text">1. Contract Information</h4>
                        </div>
                        <table class="content-card-table table table-borderless">
                            <tbody>
                                <tr>
                                    <th>Contract ID</th>
                                    <td>HD00001</td>
                                    <th>Status</th>
                                    <td>Active</td>
                                </tr>
                                <tr>
                                    <th>Product</th>
                                    <td>Bao hiem Bao Viet cho xe duoi 50cc</td>
                                    <th>Contract Fee</th>
                                    <td>530000</td>
                                </tr>
                                <tr>
                                    <th>Start Date</th>
                                    <td>25/1/2021</td>
                                    <th>End Date</th>
                                    <td>25/1/2022</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="row border rounded compensation-card">
                        <div class="title-card">
                            <h4 class="title-card-text">2. Accident Information</h4>
                        </div>
                        <table class="content-card-table table table-borderless">
                            <tbody>
                                <tr>
                                    <th>Title</th>
                                    <td><input class="compensation-input" type="text" /></td>
                                    <th>Date</th>
                                    <td>
                                        <input
                                            class="compensation-input"
                                            type="date"
                                            name=""
                                            id=""
                                            />
                                    </td>
                                </tr>
                                <tr>
                                    <th>Attachment</th>
                                    <td><span id="accident-file-name" class="attachment-file-name">a;sdfjqifadsfjk</span>
                                        <button type="button" onclick="uploadFile('accident-file-url','accident-file-name')" class="import-attachment-button">Import file</button>
                                        <input id="accident-file-url" type="hidden"></td>
                                    <th></th>
                                    <td></td>
                                </tr>
                                <tr>
                                    <th>Human damage</th>
                                    <td>
                                        <textarea
                                            class="compensation-input"
                                            name=""
                                            id=""
                                            cols="30"
                                            rows="10"
                                            ></textarea>
                                    </td>
                                    <th>Vehicle damange</th>
                                    <td>
                                        <textarea
                                            class="compensation-input"
                                            name=""
                                            id=""
                                            cols="30"
                                            rows="10"
                                            ></textarea>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="row border rounded compensation-card">
                        <div class="title-card">
                            <h4 class="title-card-text">3. Compensation Information</h4>
                        </div>
                        <table class="content-card-table table table-borderless">
                            <tbody>
                                <tr>
                                    <th>Driver Name</th>
                                    <td><input class="compensation-input" type="text" /></td>
                                    <th>Attachment</th>
                                    <td><span id="compensation-file-name" class="attachment-file-name">a;sdfjqifadsfjk</span>
                                        <button type="button" onclick="uploadFile('compensation-file-url', 'compensation-file-name')" class="import-attachment-button">Import file</button>
                                        <input id="compensation-file-url" type="hidden"></td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="content-card-table table table-borderless">
                            <tbody>
                                <tr>
                                    <th>Description</th>
                                    <td>
                                        <textarea
                                            class="compensation-input"
                                            name=""
                                            id=""
                                            cols="100"
                                            rows="10"
                                            ></textarea>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <div class="commitment">
                            <input type="checkbox" id="" /><span
                                >I commit that all information is real. If are wrong, I
                                will face with law’s punishment.</span
                            >
                        </div>
                        <div class="compensation-submit">
                            <button type="submit">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </main>
        <jsp:include page="../footer_full.jsp"/>
        <script>
            function uploadFile(idDomURL, idDomFileName) {
                const client = filestack.init("A0zUebBNQ3Of3nd5r8IRwz");
                const options = {
                    onFileSelected: file => {
                        // If you throw any error in this function it will reject the file selection.
                        // The error message will be displayed to the user as an alert.
                        if (file.size > 1000 * 1000) {
                            throw new Error('File too big, select something smaller than 1MB');
                        }
                    },
                    onUploadDone: file => {
                        console.log(file);
                        fileURL = file.filesUploaded[0].url;
                        fileName = file.filesUploaded[0].filename;
                        document.querySelector("#" + idDomURL).value = fileURL;
                        document.querySelector("#" + idDomFileName).innerHTML = fileName;
                    }
                };
                client.picker(options).open();
            }
        </script>

    </body>
</html>
