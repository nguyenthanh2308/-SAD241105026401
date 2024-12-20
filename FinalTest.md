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
- Mô hình Client-Server, máy chủ chạy trên hệ điều hành Windows với giao diện trình duyệt. Máy chủ có thể sử dụng IIS (Internet Information Services) để quản lý các ứng dụng web, đảm bảo hiệu suất và khả năng bảo mật tốt trong môi trường Windows.  
Các hệ thống tích hợp:  
- Xác thực đa yếu tố (Single Sign-On).  
- Hệ thống kê đơn thuốc (PRESCRIPTION).  

Kết quả phân tích các ca sử dụng:  
Ca 1: Quản lý hồ sơ bệnh nhân:  
![Diagram](https://www.planttext.com/plantuml/png/JCun2eCm5CRnFQTuP7VG0nGXInT16fpbDNcMG9gKlEVWsJhqIBr2KPIw_OSV7z_t_MbPiCZyZ0gTv0BQn922mmXMS9eq88EnIirC3fb0TvZmGT2Z14e2DtAvUDxSKF_PyF8e11tvRUmQM79PTZQUO5-8NGdtmqh8wM2DKiP2LLtMwQ7UQpnterfAVlt_0m00__y30000)  
Giải thích ca sử dụng:  
Mô tả chung:  
- Nhân viên lâm sàng sử dụng hệ thống để quản lý toàn bộ hồ sơ bệnh nhân, bao gồm thông tin cá nhân, lịch sử y tế, và các chi tiết liên quan đến chẩn đoán, điều trị.  

Chi tiết:  

Cập nhật lịch sử y tế (Update Medical History):  
- Nhân viên lâm sàng nhập thông tin mới về bệnh nhân, như chẩn đoán, triệu chứng, hoặc các nhận xét từ buổi khám.  
- Hệ thống cho phép lưu giữ đầy đủ thông tin, đảm bảo tính liên tục của hồ sơ y tế.  

Kê đơn thuốc (Prescribe Medication):  
- Bác sĩ kê đơn thuốc trực tiếp trên hệ thống, chọn từ danh mục thuốc có sẵn.  
- Hệ thống kiểm tra tương tác thuốc và liều lượng để giảm thiểu rủi ro.
  
Ca 2: Cảnh báo nguy cơ:  

![Diagram](https://www.planttext.com/plantuml/png/J8v12i9034NtSuhGVHUT0qYbRXLnA2vB6DCI73CmIK_dmYDv1QceTVVXFVx_p_kZLSDYyoqvZ9OBL5rYuOW9Wk4uLe0ANN1kLege1DKsKJ4uiLxr3Nk_idqMNafsA1ELF2iSqPZ4lkhGh78WkS0PYx1CSCZ68qSqplAJlNDTWBhUB2Ez_wIX-SlUjIINvVuB003__mC0)  
Giải thích ca sử dụng:  

Mô tả chung:  
Hệ thống theo dõi và cảnh báo về các rủi ro liên quan đến bệnh nhân có hành vi tự hại hoặc gây nguy hiểm cho người khác.

Chi tiết:  

Giám sát bệnh nhân nguy hiểm (Monitor Dangerous Patients):  
- Hệ thống tự động phân tích hồ sơ bệnh nhân để nhận diện nguy cơ.  
- Gắn cờ bệnh nhân có tiền sử tự hại hoặc bạo lực.

Gửi thông báo cảnh báo (Send Warning Notifications):  
- Cảnh báo được gửi tới nhân viên lâm sàng và người liên quan qua email hoặc hệ thống.  
- Đảm bảo các biện pháp phòng ngừa được triển khai kịp thời.

Ca 3: Tạo báo cáo:  

![Diagram](https://www.planttext.com/plantuml/png/PC-n3e9030RW_PwYOMS0TiF5mOb5mamQAEOIhvXUCT5NS_2HV0Lpec9m-_FtIvi-RlSoA8fE_cYmqr4WiRrtx88AgZiJr8h3a006iFM7LCXu80clkZ9c2jHX84Xsn2Ie17iwZQ8pQ8e5R8NYU5xWYNKbs-pFMXxvujsL-hNDZR4rfEacdcYATsgpdvoRQgc_CJSbSHz_VW800F__0m00)  

Giải thích ca sử dụng: 

Mô tả chung:  
Nhân viên hành chính tạo các báo cáo chi tiết và ẩn danh để phục vụ công tác quản lý.

Chi tiết:  
Tạo báo cáo quản lý (Create Management Reports):  
- Báo cáo định kỳ về số lượng bệnh nhân, tình trạng bệnh, và chi phí điều trị.
- Phục vụ quản lý hiệu suất các phòng khám và bệnh viện.

Tạo báo cáo ẩn danh (Create Anonymized Reports):
- Báo cáo tổng hợp không chứa thông tin nhận dạng cá nhân, dành cho mục đích nghiên cứu hoặc công khai.
- Đảm bảo tuân thủ luật bảo mật thông tin.

Ca 4: Quản lý lịch hẹn: 

![Diagram](https://www.planttext.com/plantuml/png/RCz12eCm40NGVKunPEz2SLtC0LobhiEGZ2MqYP8P2vwjYnwfLoWMGHVT_SNZV_xdzUvOiCYI7WgzJ0Mq2Idco59GufF02ewZ1cGmLgc5oICJw1uptWZCF4ynIw8i_4D3UnYxPdyMO5SMIhjpzI6l1VqT-iXCuL-dQvGo5ghgiWqCxPvSVSgDwYY7xSWN003__mC0)  

Giải thích ca sử dụng:  

Mô tả chung:  
- Hệ thống hỗ trợ nhân viên hành chính quản lý lịch hẹn bệnh nhân, đảm bảo dữ liệu đồng bộ và theo dõi các cuộc hẹn bị bỏ lỡ.

Chi tiết:  

Đồng bộ hệ thống lịch hẹn (Sync Appointment System):
- Kết nối với hệ thống APPOINTMENTS để tải danh sách lịch hẹn mới.
- Đảm bảo dữ liệu chính xác và cập nhật theo thời gian thực.

Theo dõi lịch hẹn bị bỏ lỡ (Track Missed Appointments):  
- Ghi nhận thông tin bệnh nhân không đến lịch hẹn.
- Hỗ trợ nhân viên liên hệ lại với bệnh nhân và sắp xếp lịch mới.

* Chú thích:
- Ca 1: Tài liệu (trang 3 - trang 10 ), (https://github.com/opendesigncasestudies/Mentcare-IanSommerville), (https://software-engineering-book.com/case-studies/mentcare/)
- Ca 2: Tài liệu (trang 10 - 12, 15 - 17)
- Phân tích từ Software Engineering liên quan đến cảnh báo y tế và an toàn người dùng (https://github.com/opendesigncasestudies/Mentcare-IanSommerville)
- Ca 3: Tài liệu (trang 12 - 14)
- Hướng dẫn từ các tài liệu liên quan đến thiết kế hệ thống báo cáo y tế​ (https://github.com/opendesigncasestudies/Mentcare-IanSommerville),
- Ca 4: Tài liệu (Trang 11), (https://github.com/opendesigncasestudies/Mentcare-IanSommerville), (https://software-engineering-book.com/case-studies/mentcare/)
- Software Engineering, Ian Sommerville: Tài liệu tiêu chuẩn về kỹ thuật phần mềm với các ví dụ và hướng dẫn liên quan đến hệ thống y tế.





















































