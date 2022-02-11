/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.externalmodule;

/**
 *
 * @author area1
 */
public class PaginationModule {
//     public static int PAGE_SIZE = 2;
    // Đầu vào là Index của trang đó và số lượng bản ghi trên từng trang
    // trả về kết quả là 1 mảng 2 phần tử: phần tử đầu tiên là thứ tự bản ghi đầu tiên của 1 trang, phần tử thứ 2 là index 
    //  của bản ghi cuối cùng của 1 trang
    
    public static int[] calcFromToRecord(int pageIndex, int PAGE_SIZE){
        int[] fromTo = new int[2];
        fromTo[0] = (pageIndex - 1) * PAGE_SIZE + 1;
        fromTo[1] = pageIndex*PAGE_SIZE;
        return fromTo;
    }
    
     // Đầu vào là tổng số bản ghi query ra được và số lượng bản ghi trên từng trang
    // trả về tổng số trang dựa trên số bản ghi
    public static int calcTotalPage(int totalRecord, int PAGE_SIZE){
        if(totalRecord%PAGE_SIZE==0){
            return totalRecord / PAGE_SIZE;
        } else {
            return totalRecord/PAGE_SIZE + 1;
        }
    }
}
