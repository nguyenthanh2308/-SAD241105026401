<div align="center">
  <h1>
           <strong> BÁO CÁO CUỐI KỲ</strong>
  </h1>
  <h3>
  Mentcare: A mental health support system
  </h3>
</div>


* Mô tả công việc    
-Thông tin thành viên nhóm, vai trò  
-Phân công công việc và mức độ hoàn thành	  
1. Mô tả tóm tắt bài toán  
- Sự cần thiết, lợi ích khi giải quyết bài toán  
- Các yêu cầu chức năng  
- Các yêu cầu phi chức năng  
2. Phân tích các ca sử dụng  
- Kiến trúc đề xuất  
- Các cơ chế phân tích  
- Kết quả phân tích từng ca sử dụng  
- Kết quả phân tích ca sử dụng 1  
- Kết quả phân tích ca sử dụng 2   
- Kết quả phân tích ca sử dụng 3  
3. Xác định các phần tử thiết kế  
4. Thiết kế hệ thống con  
5. Thiết kế các lớp  
6. Kết luận  

* Mô tả công việc:  
-Thông tin thành viên nhóm:
1. Nguyễn Minh Thành: 4551190048 ( Trưởng nhóm )  
2. Nguyễn Huỳnh Đức Thành: 4551190047 (Thành viên )  
3. Hoàng Xuân Dũng: 4551190008 ( Thành viên )  
4. Nguyễn Diệp Thanh Hoàng: 4551190021 ( Thành viên )   
* Phân công công việc và mức độ hoàn thành:  
 - Mô tả tóm tắt bài toán, Phân tích các ca sử dụng ( Nguyễn Minh Thành )
 - Xác định các phần tử thiết kế ( Nguyễn Huỳnh Đức Thành )
 - Thiết kế hệ thống con ( Nguyễn Diệp Thành Hoàng )
 - Thiết kế các lớp ( Hoàng Xuân Dũng )
 - Kết luận ( Cả nhóm )

I. Mô tả tóm tắt bài toán:  
* Sự cần thiết và lợi ích:  
- Đảm bảo quản lý hồ sơ chính xác, giảm thiểu sai sót, và tuân thủ luật pháp như Mental Health Act​ (1)  
- Tăng cường khả năng tạo báo cáo quản lý, cảnh báo y tế và hỗ trợ ra quyết định​ (2)  (3 trang 30)      

​* Các yêu cầu chức năng:  
 - Quản lý hồ sơ bệnh nhân, bao gồm thông tin cá nhân, chẩn đoán, và thuốc kê đơn​ (2)  
 - Cảnh báo nguy cơ tự hại hoặc bạo lực dựa trên hồ sơ y tế​  (1)
 - ích hợp hệ thống lịch hẹn (APPOINTMENTS) và quản lý giam giữ bệnh nhân (3 trang 30)  
* Các yêu cầu phi chức năng:  
- Giao diện dễ sử dụng, phản hồi nhanh (<2 giây)​ (2)
- Bảo mật và quyền riêng tư nghiêm ngặt theo tiêu chuẩn y tế (1)  

*Chú thích:  
(1) https://software-engineering-book.com/case-studies/mentcare/  
(2) https://github.com/opendesigncasestudies/Mentcare-IanSommerville  
(3) https://fr.slideshare.net/slideshow/se-chapter-4-software-requirementspptx/266205338
   
II. Phân tích các ca sử dụng:  
Kiến trúc đề xuất:  
Mô hình Client-Server, máy chủ chạy trên hệ điều hành Windows với giao diện trình duyệt. Máy chủ có thể sử dụng IIS (Internet Information Services) để quản lý các ứng dụng web, đảm bảo hiệu suất và khả năng bảo mật tốt trong môi trường Windows.  
Các hệ thống tích hợp:  
Xác thực đa yếu tố (Single Sign-On).  
Hệ thống kê đơn thuốc (PRESCRIPTION).  

Kết quả phân tích các ca sử dụng:  
Ca 1: Quản lý hồ sơ bệnh nhân:  
[!Diagram](https://www.planttext.com/plantuml/png/JCun2eCm5CRnFQTuP7VG0nGXInT16fpbDNcMG9gKlEVWsJhqIBr2KPIw_OSV7z_t_MbPiCZyZ0gTv0BQn922mmXMS9eq88EnIirC3fb0TvZmGT2Z14e2DtAvUDxSKF_PyF8e11tvRUmQM79PTZQUO5-8NGdtmqh8wM2DKiP2LLtMwQ7UQpnterfAVlt_0m00__y30000)




















































