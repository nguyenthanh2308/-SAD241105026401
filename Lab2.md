I. Phân tích các ca sử dụng còn lại trong hệ thống Payroll System.
   
   1. Add Employee:
  
Mô tả:

Actor: Quản trị viên hệ thống.

Chức năng: Thêm một nhân viên mới vào cơ sở dữ liệu, bao gồm thông tin cá nhân, phương thức thanh toán, và loại hợp đồng (theo giờ, lương tháng, hoa hồng).

Các lớp phân tích:

PayrollAdmin: Người thêm nhân viên.

Employee: Lớp đại diện cho nhân viên.

PayrollDatabase: Lưu thông tin nhân viên.

![Diagram](https://www.planttext.com/api/plantuml/png/L8ux3i8m44JxFSKg5IboWHGeHA7d2eEzXIN_P2z8EHi5H-8AE084b3FlQJIFstsgYgANu0b6K-4JrfAyFzZW8kM6d74PKRbxamMACwfqZChB_EySG_PfbHTiWUXtZuVzLeviYa3b8--iA9olFRM6XoOjyyWLrw_HqoJHRY-V0000__y30000)

2. Delete Employee
   
Mô tả:

Actor: Quản trị viên hệ thống.

Chức năng: Xóa một nhân viên khỏi hệ thống.

Các lớp phân tích:

PayrollAdmin: Người thực hiện xóa.

PayrollDatabase: Xóa thông tin nhân viên dựa trên ID.

![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aK90OcLHVawEOqfkPXvN0L0gCpcp836lH449AkEIM9AOb5YSggIGMApWuiJ5XQn3GTSEA6Qba9AQargIwffRa9DVcPggaGfbUAPeSZcavgM0h0C0003__mC0)

3. Post a Sale

Mô tả:


Actor: Nhân viên bán hàng (hoa hồng).
Chức năng: Đăng thông tin bán hàng để tính hoa hồng.

Các lớp phân tích:

CommissionedEmployee: Đăng thông tin bán hàng

SaleRecord: Lưu thông tin bán hàng.

PayrollDatabase: Lưu thông tin giao dịch.

![Diagram](https://www.planttext.com/api/plantuml/png/R8uz2i9048NxESMGAYboWHGIujgBdc3SdM9X_zWPXPpDmYDv1RDfHB1x7-_ZyTxFronALUyn05dD5OyvHY_YSs9tYYNabHdAfdZh2oN5xanhpI4OKhgHS8SaQ9PVvqg1BsnpTNlT4E3VD8w7lPtGLYRbbdl7IZx808rmt1IpJ2ZquEzkFy3CoRNZ7m000F__0m00)

4. Generate Paycheck

Mô tả:

Actor: Hệ thống tự động (hoặc quản trị viên khởi động)

Chức năng: Tính toán lương cho nhân viên dựa trên loại hợp đồng, giờ làm việc, hoặc doanh số.

Các lớp phân tích:

Employee: Tính lương dựa trên thông tin làm việc

PayrollSystem: Điều phối việc tạo paycheck.

PaymentMethod: Xử lý thanh toán.

![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bS1aCvCpYn8p2jHK0f8h2pApya9hYmkISrLKaWiLe0mKLMvvXRav5Ucfe8L03aOPkIcvfNuffPavAU0bGJuSd51p57GjGDfi598Jin9Bir9B4a5gjRGv0AAWQG2VAqK2ehoarEBYw6cQ2JcvfVcbMXoEQJcfO2S2m000F__0m00)

5. Change Employee Details

Mô tả:

Actor: Quản trị viên hệ thống.

Chức năng: Thay đổi thông tin nhân viên như phương thức thanh toán hoặc loại hợp đồng.

Các lớp phân tích:

PayrollAdmin: Thực hiện thay đổi.

Employee: Cập nhật thông tin chi tiết.

PayrollDatabase: Lưu thông tin cập nhật.

![Diagram](https://www.planttext.com/api/plantuml/png/P8yn3eCm34Ltdy9YWe4BC5GKfKEtBZs0IwmgKWWHCLIShKEFr2iq191QTVlMU_wMtyzN7OG66JiBr4e_u8NceRVsg3lZm4TaMkF92MORKIHqey0PKa3L_3gdpjj-vXN60U2x3yj3tAZmphABEM_Xh0jG3PPHYQp2NK3DGiQ6lw9aZLwJi5gLtF5ZYmL4dCgMUu4clYPJxse1DJkzlFq1003__mC0)

6. Query Employee Data

Mô tả:

Actor: Quản trị viên hệ thống.

Chức năng: Tìm kiếm và hiển thị thông tin nhân viên.

Các lớp phân tích:

PayrollAdmin: Người yêu cầu thông tin.

PayrollDatabase: Cung cấp dữ liệu nhân viên.

![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aK90OcLHVawEOqfkPXvN0L0gCpcp836lH449AkEIM9AOb5YSggIGMApWuiJ5XQn3GTSEA6QbK5YQMbJfcbkGar-PcggH2cLufcXokJWfw08L8MkoKe2fL4X9BKdCp2dcSaZDIm6v2G000F__0m00)

7. Generate Reports
   
Mô tả:

Actor: Quản trị viên hệ thống.

Chức năng: Tạo báo cáo tổng hợp như bảng lương hoặc giờ làm việc.

Các lớp phân tích:

PayrollAdmin: Người yêu cầu báo cáo.

PayrollDatabase: Truy xuất dữ liệu để tạo báo cáo.

![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aK90OcLHVawEOqfkPXvN0L0gCpcp836lH449AkEIM9AOb5YSggIGMApWuiJ5XQn3GTSEA6Qba9wQbrgKM98Qb5gGNrIYKGIcGYeBKdKKmFO13G4oK_DIG0nDBXSd1LsWJcIJh1GWUXLIWFPnEG2LWjm80000__y30000)




