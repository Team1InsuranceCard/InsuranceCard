<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insurance Card</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

        <!--        <meta charset="UTF-8">-->
        <!--<meta name="viewport" content="width=device-width, initial-scale=1.0">-->
        <!-- include libraries(jQuery, bootstrap) -->

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"  crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>

        <!-- include summernote css/js -->
        <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>

        <script src="asset/script/summernote.js"></script>

        <style>
            main {
                margin-top: 73px;
                margin-left: 290px;
                padding: 35px 45px 50px;
                color: #5C2941;
            }

            .header__btn {
                margin: 1em;
            }

            .btn--box {
                border: none;
                font-size: 18px;
                border-radius: 4px;
                min-width: 90px;
                text-align: center;
                box-sizing: content-box;
                margin-top: 2em;
            }

            .btn--primary {
                background-color: #4FCD5C;
                color: #fff;
                transition: all 0.2s;
                border-radius: 6px;
                /*display: inline-block;*/
            }

            .btn--primary:hover {
                background: rgba(79, 205, 92, 0.8);
            }

            .btn--secondary {
                background-color: #E76666;
                color: #000;
                text-decoration: none;
                transition: all 0.2s;
                border-radius: 6px;
                /*display: inline-block;*/
            }

            .btn--secondary:hover {
                background: rgba(231, 102, 102, 0.8);
                color: #fff;
            }

            .btn--box input {
                margin-right: 3em;
                border: #4FCD5C outset;
            }

            .btn--box a {
                padding: 2px 6.5em;
                border: #FB6376 outset;
            }

            .section__img {
                height: 10em;
                background-color: black;
            }

            .section_upload {
                margin-top: 7em;
            }

            .text input{
                margin-top: 0.7em;
                margin-bottom: 10px;
                border-radius: 8px;
                padding: 15px 25px;
                border: solid #000;
                background: rgba(253, 177, 166, 0.7);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 3rem;
            }

            .text textarea {
                margin-top: 1em;
                margin-bottom: 10px;
                border-radius: 8px;
                padding: 15px 25px;
                border: solid #000;
                background: rgba(253, 177, 166, 0.7);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 10rem;
                resize: none;
            }

            .text select {
                margin-top: 0.7em;
                margin-bottom: 10px;
                border-radius: 8px;
                padding: 15px 25px;
                border: solid #000;
                background: rgba(253, 177, 166, 0.7);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 3.5rem;
            }

            p {
                margin-top: 1em;
                font-weight: 500;
                font-size: 18px;
            }

            /*            .img input {
                            height: 2em;
                            border-radius: 8px;
                            padding: 5px;
                            border: none;
                            background: rgba(253, 177, 166, 0.7);
                            font-weight: bold;
                            font-size: 18px;
                            color: rgba(252, 99, 118, 1);
                        }*/

            .product-top {
                margin-bottom: 1em;
            }

            #output-cover-img {
                margin-bottom: 0.75rem;
            }

            .up-img {
                margin-bottom: 3rem;
            }

            .label {
                margin-bottom: 3rem;
                font-weight: 500;
                font-size: 18px;
            }

            #money {
                text-align: center;
                color: #E92649;
            }
        </style>
    </head>
    <body>
        <header>
            <jsp:include page="../header_moderator.jsp">
                <jsp:param name="currentscreen" value="" />
            </jsp:include>
        </header>

        <main>
            <form action="moderator/product/update" method="POST"
                  onSubmit="return submitForm(this);">
                <div class="row col-lg-12 product-top">
                    <div class="row col-lg-5 up-img top-left">
                        <img class="row col-lg-12" 
                             <c:if test="${requestScope.product.imageURL == null}">
                                 src="asset/image/moderator/image show.png" 
                             </c:if>
                             <c:if test="${requestScope.product.imageURL != null}">
                                 src="${requestScope.product.imageURL}" 
                             </c:if>
                             id="output-cover-img" style="max-width: 70%;"/>

                        <input class="cover-openfile" id="choose-img" type="file" 
                               onchange="doImgUpload(this, 'cover-url', 'output-cover-img')">

                        <input   type="hidden" id="cover-url"  name="photo">
                    </div>
                    <!--                    <div class="row col-lg-6 justify-content-between top-right">
                    
                                            <div class="row col-lg-12 align-items-start img">
                                                <img class="row col-lg-12" 
                    <c:if test="${requestScope.product.imageURL == null}">
                        src="asset/image/moderator/image show.png" 
                    </c:if>
                    <c:if test="${requestScope.product.imageURL != null}">
                        src="${requestScope.product.imageURL}" 
                    </c:if>
                    id="output-cover-img"/>
               <input class="row col-lg-12 align-self-center cover-openfile" id="choose-img" type='file' 
                      onchange="doImgUpload(this, 'cover-url', 'output-cover-img')" style="max-width: 70%;">
               <input type="hidden" id="cover-url" name="photo">
           </div>

       </div>-->
                    <div class="row col-lg-7 top-right">
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_title" class="col-lg-3">
                                <p>Title</p>
                            </label>
                            <input
                                type="text"
                                name="title"
                                id ="txt_title"
                                placeholder="Title"
                                class="col-lg-8"
                                value="${requestScope.product.title}"
                                required
                                />
                        </div>
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_price" class="col-lg-3">
                                <p>Price</p>
                            </label>
                            <!--                            <input
                                                            type="text"
                                                            name="price"
                                                            id ="txt_price"
                                                            placeholder="Price"
                                                            class="col-lg-8"
                                                            value="${requestScope.product.price}"
                                                            required
                                                            />-->
                            <input class="col-md-8" type="number" id="txt_price"
                                   onchange="money()"
                                   value="${requestScope.product.price}"
                                   min="1" name="price" required/>
                        </div>
                        <div class="row col-lg-12 justify-content-between">
                            <p class="col-md-3 label"></p>
                            <p class="col-md-8" id="money"></p>
                        </div>
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="sel_status" class="col-lg-3">
                                <p>Status</p>
                            </label>
                            <select id="sel_status" name="status" class="col-lg-8" required>
                                <option value="0" ${requestScope.product.statusCode.statusCode == 0 ? "selected" : ""}>Inactive</option>
                                <option value="1" ${requestScope.prodcut.statusCode.statusCode == 1 ? "selected" : ""}>Active</option>
                            </select>
                        </div>
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_desc" class="col-lg-3">
                                <p>Description</p>
                            </label>
                            <textarea
                                type="text"
                                name="description"
                                placeholder="Description"
                                id ="txt_desc"
                                class="col-lg-8"
                                required
                                >${requestScope.product.description}</textarea>
                        </div>
                    </div>
                </div>

                <div class="row col-lg-12 product-bot">
                    <div class="row col-lg-12">
                        <label for="smnote">
                            <p>Content detail</p>
                        </label>
                        <div hidden id="detail">${requestScope.product.contentDetail}</div>
                        <div class="col-lg-12"><textarea id="smnote" class="summernote" name="content_detail" required></textarea></div>
                    </div>
                    <div class="row col-lg-12 justify-content-around btn--box">
                        <input class="col-lg-3 btn--primary" type="submit" value="Submit"/>
                        <a class="col-lg-3 btn--secondary" 
                           onclick="confirmBox('Are you sure you want to cancel? Your changes will not be saved.', 'moderator/product')">Cancel</a>
                    </div>
                </div>
            </form>
        </main>

        <!--summernote-->
        <script>
            var detail = document.getElementById("detail").innerHTML;
            $('#smnote').summernote('code', detail);
        </script>

        <!--upload image-->
        <script>
            function doImgUpload(fileInputId, urlout, imgout) {
                var form = new FormData();
                const outputURL = document.getElementById(urlout);
                const outputImg = document.getElementById(imgout);
                form.append("image", fileInputId.files[0]);
                fetch("https://api.imgbb.com/1/upload?key=1af8cbe03c0cb11d90d17917021deeeb", {
                    method: "post",
                    body: form
                }).then(data => data.json()).then(data => {
                    outputURL.value = data.data.url;
                    outputImg.src = data.data.url;
                });
            }
        </script>

        <!-- confirm box -->
        <script>
            function confirmBox(mess, url) {
                if (confirm(mess)) {
                    location.href = url;
                }
            }

            function submitForm() {
                return confirm('Do you really want to submit the form?');
            }
        </script>

        <!--money-->
        <script>
            var ChuSo = new Array(" không ", " một ", " hai ", " ba ", " bốn ", " năm ", " sáu ", " bảy ", " tám ", " chín ");
            var Tien = new Array("", " nghìn", " triệu", " tỷ", " nghìn tỷ", " triệu tỷ");
            function DocSo3ChuSo(baso)
            {
                var tram;
                var chuc;
                var donvi;
                var KetQua = "";
                tram = parseInt(baso / 100);
                chuc = parseInt((baso % 100) / 10);
                donvi = baso % 10;
                if (tram == 0 && chuc == 0 && donvi == 0)
                    return "";
                if (tram != 0)
                {
                    KetQua += ChuSo[tram] + " trăm ";
                    if ((chuc == 0) && (donvi != 0))
                        KetQua += " linh ";
                }
                if ((chuc != 0) && (chuc != 1))
                {
                    KetQua += ChuSo[chuc] + " mươi";
                    if ((chuc == 0) && (donvi != 0))
                        KetQua = KetQua + " linh ";
                }
                if (chuc == 1)
                    KetQua += " mười ";
                switch (donvi)
                {
                    case 1:
                        if ((chuc != 0) && (chuc != 1))
                        {
                            KetQua += " mốt ";
                        } else
                        {
                            KetQua += ChuSo[donvi];
                        }
                        break;
                    case 5:
                        if (chuc == 0)
                        {
                            KetQua += ChuSo[donvi];
                        } else
                        {
                            KetQua += " lăm ";
                        }
                        break;
                    default:
                        if (donvi != 0)
                        {
                            KetQua += ChuSo[donvi];
                        }
                        break;
                }
                return KetQua;
            }

            function DocTienBangChu(SoTien)
            {
                var lan = 0;
                var i = 0;
                var so = 0;
                var KetQua = "";
                var tmp = "";
                var ViTri = new Array();
                if (SoTien < 0)
                    return "Số tiền âm !";
                if (SoTien == 0)
                    return "Không đồng !";
                if (SoTien > 0)
                {
                    so = SoTien;
                } else
                {
                    so = -SoTien;
                }
                if (SoTien > 8999999999999999)
                {
                    //SoTien = 0;
                    return "Số quá lớn!";
                }
                ViTri[5] = Math.floor(so / 1000000000000000);
                if (isNaN(ViTri[5]))
                    ViTri[5] = "0";
                so = so - parseFloat(ViTri[5].toString()) * 1000000000000000;
                ViTri[4] = Math.floor(so / 1000000000000);
                if (isNaN(ViTri[4]))
                    ViTri[4] = "0";
                so = so - parseFloat(ViTri[4].toString()) * 1000000000000;
                ViTri[3] = Math.floor(so / 1000000000);
                if (isNaN(ViTri[3]))
                    ViTri[3] = "0";
                so = so - parseFloat(ViTri[3].toString()) * 1000000000;
                ViTri[2] = parseInt(so / 1000000);
                if (isNaN(ViTri[2]))
                    ViTri[2] = "0";
                ViTri[1] = parseInt((so % 1000000) / 1000);
                if (isNaN(ViTri[1]))
                    ViTri[1] = "0";
                ViTri[0] = parseInt(so % 1000);
                if (isNaN(ViTri[0]))
                    ViTri[0] = "0";
                if (ViTri[5] > 0)
                {
                    lan = 5;
                } else if (ViTri[4] > 0)
                {
                    lan = 4;
                } else if (ViTri[3] > 0)
                {
                    lan = 3;
                } else if (ViTri[2] > 0)
                {
                    lan = 2;
                } else if (ViTri[1] > 0)
                {
                    lan = 1;
                } else
                {
                    lan = 0;
                }
                for (i = lan; i >= 0; i--)
                {
                    tmp = DocSo3ChuSo(ViTri[i]);
                    KetQua += tmp;
                    if (ViTri[i] > 0)
                        KetQua += Tien[i];
                    if ((i > 0) && (tmp.length > 0))
                        KetQua += ',';
                }
                if (KetQua.substring(KetQua.length - 1) == ',')
                {
                    KetQua = KetQua.substring(0, KetQua.length - 1);
                }
                KetQua = KetQua.substring(1, 2).toUpperCase() + KetQua.substring(2) + " đồng";
                return KetQua;
            }

            function money() {
                var input = document.getElementById("txt_price").value;
                var m = DocTienBangChu(input);
                document.getElementById("money").innerHTML = m;
            }
        </script>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>
