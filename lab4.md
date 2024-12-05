1. Login:

Mô tả: Người dùng nhập thông tin đăng nhập và hệ thống xác thực để cấp quyền truy cập.

Phần tử thiết kế:

LoginForm: Giao diện nhập thông tin đăng nhập.

PayrollController: Điều phối logic xác thực.

Employee: Xác minh thông tin tài khoản.

Lý do thiết kế:

Sử dụng LoginForm để tách biệt giao diện.

PayrollController xử lý logic xác thực, giúp hệ thống bảo mật hơn.


![Diagram](https://www.planttext.com/api/plantuml/png/R9112i8m44NtESNGbO9Ue0if55sv4C433CrWWsccJ59Bp-R28ta5auejXQwIFtd__o6Vrxlm0ILqZLLO1HQuUHBLnf6fJ8ikG7Rckt4dbYO3z90ko_SB3iBMbkn2Eab6RfPB-jYqbWUY4Of2gTG8-yEOd0Ev46KNPmuR0dGQMlI-Pz4g4OcSitDueZKQ0st-bjt4RzKC9bjiow6ggNgKGZeM6RH-rHT9sAyN6NPNyfqDY_1fVLzp3_832d8wVUmN003__mC0)

2. Maintain Timecard:
   
Mô tả: Nhân viên quản lý giờ làm việc, bao gồm thêm, sửa, hoặc gửi timecard.

Phần tử thiết kế:

TimecardForm: Giao diện quản lý timecard.

TimecardController: Điều phối thao tác trên timecard.

Timecard: Lưu trữ thông tin giờ làm việc.

ProjectManagementDatabase: Xác thực mã dự án.

Lý do thiết kế:

Phân tách TimecardController để đảm bảo logic độc lập, dễ bảo trì.

Dùng ProjectManagementDatabase để quản lý mã dự án.

![Diagram](https://www.planttext.com/api/plantuml/png/R95DQiCm44RtEeN8gbxa0bw44AM1B0AX-08JwSDrqH_IkD2pTT4ZzGgDrDecQNRIp9itdz3tvzSsCoKUdHMaEIJvxA8D7u28r_AWXqYUvQeR73GbSmZ9hIHbMGwF4HKyfs0jKWMNwor-Jk4Dca_agOU3vpqnNIYZJfrF-zrZVMrtIeWfg5nlQffMXWW_OK-DACNIN1AqiWVF1Fu4HzE8XIaJPNjbrIkb7YeOvAkmbENwpgWNvCxIgLQEqH1ZNcd0DDZSY4xz4sLwnmloQFd6Cx_kLsKcbzZ2c_9jFm000F__0m00)

3. Run Payroll

Mô tả: Tính toán lương và thực hiện thanh toán.

Phần tử thiết kế:

PayrollController: Điều phối xử lý lương.

BankSystem: Thực hiện thanh toán qua ngân hàng.

PrintService: In phiếu lương.

Employee: Lưu thông tin hợp đồng và giờ làm việc.

Lý do thiết kế:

Phân tách BankSystem và PrintService giúp dễ dàng mở rộng và tích hợp.

PayrollController xử lý toàn bộ logic nghiệp vụ liên quan đến lương.

![Diagram](https://www.planttext.com/api/plantuml/png/P94zRiCm38LtdOB8b0ovW8SYwCzU82SW61OL8b46HHVmsJhqIBb2AJj0QdMI-FZuFGgwVV-Sgg7Qb5D0ig9mdgjn3gEBaUA8Oh1xnrbBIYz5h9siEy0AZtBhVijZAZFpOl9Ystr6kQuPIx-LNPX6iJFhLwGLiGWU4jOnE3xzYHv09xdljp-4HwFPF7m0maHJGcDtkSCrE7Q8YWbrVcN3c6h7Q0iEC6eXhjKHcSNscu53Q9v_K2ho4JMZnI8Ty_wYXlMBG-cJwTfJJooNzY-_0000__y30000)

4. Add Employee

Mô tả: Thêm nhân viên mới vào hệ thống.

Phần tử thiết kế:

PayrollAdmin: Người thực hiện.

Employee: Lưu thông tin nhân viên.

PayrollDatabase: Cơ sở dữ liệu lưu trữ.

Lý do thiết kế:

Sử dụng PayrollAdmin để giới hạn quyền truy cập.

PayrollDatabase đảm bảo thông tin nhân viên được lưu trữ tập trung.

![Diagram](https://www.planttext.com/api/plantuml/png/L8uz3i8m58FtTugdJdJe1JgWKfMTAvZa3P7of-I1rBCnS2IkG2f0m6Zxi-N7xJvLHT5By0IZgV09QqdU7snmaNABd74PKRaxXkpJAj8nAZVndxvx2nHdr1Uqp4I_Uppij-B8fWXKFeCxAmhdQq_DuQ51opnonVLBz3H9jDlB9m000F__0m00)

5. Delete Employee

Mô tả:

Xóa một nhân viên khỏi hệ thống.

Phần tử thiết kế liên quan

PayrollAdmin: Người thực hiện.

PayrollDatabase: Xóa thông tin nhân viên.

Lý do thiết kế:

Phân quyền rõ ràng qua lớp PayrollAdmin.

PayrollDatabase đảm bảo xóa dữ liệu một cách an toàn.

![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aK90OcLHVawEOqfkPXvN0L0gCpcp836lH449AkEIM9AOb5YSggIGMApWuiJ5XQn3GTSEA6Qba9AQargIwffRa9DVcPggaGfbUAPeSZcavgM0h0C0003__mC0)

6. Post a Sale:

Mô tả:

Nhân viên bán hàng (hoa hồng) đăng thông tin bán hàng để hệ thống tính toán hoa hồng.

Phần tử thiết kế liên quan

CommissionedEmployee: Đại diện nhân viên được trả hoa hồng.

SaleRecord: Lưu thông tin giao dịch bán hàng.

PayrollDatabase: Lưu trữ thông tin bán hàng.

Lý do thiết kế:

Lớp CommissionedEmployee được sử dụng để gắn thông tin bán hàng vào nhân viên cụ thể.

SaleRecord đảm bảo mỗi giao dịch được lưu trữ độc lập, giúp dễ dàng truy xuất thông tin.


![Diagram](https://www.planttext.com/api/plantuml/png/R8uz2i9048NxESMGAYboWHGIujgBdc3SdM9X_zWPXPpDmYDv1RDfHB1x7-_ZyTxFronALUyn05dD5OyvHY_YSs9tYYNabHdAfdZh2oN5xanhpI4OKhgHS8SaQ9PVvqg1BsnpTNlT4E3VD8w7lPtGLYRbbdl7IZx808rmt1IpJ2ZquEzkFy3CoRNZ7m000F__0m00)

7. Generate Paycheck:

Mô tả:

Hệ thống tạo phiếu lương cho nhân viên dựa trên hợp đồng, giờ làm việc, hoặc doanh số bán hàng.

Phần tử thiết kế liên quan

PayrollController: Điều phối quá trình tạo phiếu lương.

Employee: Cung cấp thông tin hợp đồng, giờ làm việc, và doanh số.

Paycheck: Đại diện phiếu lương.

BankSystem và PrintService: Hỗ trợ thanh toán và in phiếu lương.

Lý do thiết kế:

Sử dụng Paycheck để lưu thông tin chi tiết từng phiếu lương, đảm bảo tính minh bạch.

BankSystem và PrintService hoạt động độc lập để tăng khả năng mở rộng.

![Diagram](https://www.planttext.com/api/plantuml/png/P94n3i8m34Ntdi9YWe4BT40LXRqI9x221H5fKZa6gMTZu4XS0QS5IiEKsF_v-qTvtXzL56Ivjgv08u7Xq4UXjkYqQOtjq0ii6kmvE5S7B-aaNW16cCevlMyx5tgY0TBYpykSoLm6jQdduXRzPGmmoAdCfjbwEH3Vh1dzXuOcACOnM6z-SfLm8a-CGf-jorKnoGdMV2KOTERgHam9xS4wCuheaFiT2LeNCu-cLWkctpKpFD-PdbL2ny5GZ3hIafTbK-VO-sc9rClNEe4L-MFwiXS0003__mC0)

8. Change Employee Details:

Mô tả:

Quản trị viên thay đổi thông tin nhân viên, bao gồm thông tin cá nhân, phương thức thanh toán, và loại hợp đồng.

Phần tử thiết kế liên quan

PayrollAdmin: Người thực hiện.

Employee: Lưu thông tin nhân viên.

PayrollDatabase: Cập nhật dữ liệu.

Lý do thiết kế:

PayrollAdmin được sử dụng để giới hạn quyền chỉnh sửa thông tin nhân viên.

Employee đảm bảo mỗi nhân viên chỉ có thông tin chính xác và nhất quán.

![Diagram](https://www.planttext.com/api/plantuml/png/P8yn3eCm34Ltdy9YWe4BC5GKfKEtBZs0IwmgKWWHCQquMuSUgLTeW21HTRFrtl-MFwzt7OG66JiBr4e_u8MceRVsg3lZm4TaMkF92MQ9A1AwKU0CAQ1gVfrJvsq_yGhZ0h3lm_8G4nNUMJOnvpISTG6gmJ8g-qY5cucQXOmDVurHg73qceJLgkIEdsai8EAbTJuSwC7NnTIRMa3DJi__Vm400F__0m00)

9. Query Employee Data:

Mô tả:

Quản trị viên tìm kiếm thông tin nhân viên theo mã số hoặc các tiêu chí khác.

Phần tử thiết kế liên quan

PayrollAdmin: Người yêu cầu.

PayrollDatabase: Truy xuất dữ liệu.

Lý do thiết kế:

PayrollDatabase được tối ưu hóa để hỗ trợ truy vấn nhanh.

PayrollAdmin đảm bảo việc truy xuất thông tin được kiểm soát.

![Diagram](https://www.planttext.com/api/plantuml/png/J8ux3i9030Lxdy9A1KKka0A5QEcvWjbrOMb_U9qYPql1aRW2YmHIsZSpqdllhxaPgQqf0dahYdVQjCHu3Kaor8x4IwLiEFo88wC7DHwG6he5u5ZWUEdRXC-LTRkb6il6VF8gnYfq1hVWs9LZCk7Vmy164XlCdCFtqGS00F__0m00)

10. Generate Reports:

Mô tả:

Quản trị viên tạo các báo cáo như tổng hợp lương, số giờ làm việc, hoặc doanh số bán hàng.

Phần tử thiết kế liên quan

PayrollAdmin: Người yêu cầu báo cáo.

PayrollDatabase: Lấy dữ liệu cần thiết.

ReportGenerator: Xử lý tạo báo cáo.

Lý do thiết kế:

ReportGenerator được thiết kế riêng để tạo báo cáo, giúp dễ mở rộng cho các loại báo cáo khác nhau.

PayrollDatabase đảm bảo dữ liệu được truy xuất đầy đủ và chính xác.

![Diagram](https://www.planttext.com/api/plantuml/png/L8yn3eCm34NtdC9YebAv04D5KIJM2lK2RkAsaI14nWoShKEFr2iq4AJIoPBz_hFzURshKP1bwZk5HWQ62yuyTDtPziwh44VEk81U86if32mDUMACP0OuGjlyCrjQe-0DHrePNIkrjq9nYhaI7ib4oPlpMgvpe2COTaBiyA3QPi5rNSATn3mNSVwRwXgApPOiO2EmXc9xlxI4xN2oa3QfYhnT_lu2003__mC0)


Giải thích lý do thiết kế

1. Phân tách trách nhiệm:

Tách biệt giao diện, logic nghiệp vụ, và dữ liệu để hệ thống dễ bảo trì và mở rộng.

2. Sử dụng các lớp thiết kế sẵn:

Các phần tử thiết kế từ tài liệu trước như TimecardController, PayrollController, ProjectManagementDatabase được tái sử dụng.

3. Đảm bảo bảo mật:

Các lớp như LoginForm và PayrollController được thiết kế để quản lý xác thực và quyền truy cập chặt chẽ.

4. Khả năng mở rộng:

Phân tách các hệ thống như BankSystem, PrintService để dễ dàng tích hợp với hệ thống bên ngoài.





























