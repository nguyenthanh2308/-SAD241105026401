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

Giải thích lý do thiết kế

1. Phân tách trách nhiệm:

Tách biệt giao diện, logic nghiệp vụ, và dữ liệu để hệ thống dễ bảo trì và mở rộng.

2. Sử dụng các lớp thiết kế sẵn:

Các phần tử thiết kế từ tài liệu trước như TimecardController, PayrollController, ProjectManagementDatabase được tái sử dụng.

3. Đảm bảo bảo mật:

Các lớp như LoginForm và PayrollController được thiết kế để quản lý xác thực và quyền truy cập chặt chẽ.

4. Khả năng mở rộng:

Phân tách các hệ thống như BankSystem, PrintService để dễ dàng tích hợp với hệ thống bên ngoài.





























