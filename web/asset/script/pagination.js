/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function createPager(div, pageIndex, totalPage) {
    const GAP = 2;
    let currentUrl = location.href;
    currentUrl = currentUrl.split("#")[0];
    let requestPath = currentUrl.split("?")[0];
    let requestParam = currentUrl.split("?")[1];
     requestPath += "?" ;
    if(requestParam){
        requestParam = requestParam.replaceAll("&page=" + pageIndex, "");
          requestPath += requestParam;
    }
    currentUrl = currentUrl.replaceAll("&page=" + pageIndex, "");
    const container = document.getElementById(div);
    if (pageIndex > 1) {
        container.innerHTML += `<a href="${requestPath}&page=${pageIndex - 1}">&laquo;</a>`;
    }
    if (pageIndex - GAP > 1) {
        container.innerHTML += `<a href="${requestPath}&page=1">1</a>`;
        container.innerHTML += `<a onclick="goToPage('${requestPath}')">...</a>`;
    }
    for (let i = pageIndex - GAP; i < pageIndex; i++) {
        if (i > 0) {
            container.innerHTML += `<a href="${requestPath}&page=${i}">${i}</a>`;
        }
    }
    container.innerHTML += `<a  class="active">${pageIndex}</a>`;
    for (let i = pageIndex + 1; i <= pageIndex + GAP; i++) {
        if (i <= totalPage) {
            container.innerHTML += `<a href="${requestPath}&page=${i}">${i}</a>`;
        }
    }
    if (pageIndex + GAP < totalPage) {
        container.innerHTML += `<a onclick="goToPage('${requestPath}')">...</a>`;
        container.innerHTML += `<a href="${requestPath}&page=${totalPage}">${totalPage}</a>`;
    }

    if (pageIndex < totalPage) {
        container.innerHTML += `<a href="${requestPath}&page=${pageIndex + 1}">&raquo;</a>`;
    }
}

function goToPage(href) {
    let page = window.prompt("Go to page");
    page = parseInt(page);
    if (!page || page === "" || typeof (page) !== 'number') {
        return;
    } if (!href){
    window.location.href =  `?page=${page}`;
    } else {
         window.location.href =  `${href}&page=${page}`;
    }
}
