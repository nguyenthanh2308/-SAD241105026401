I.Đề xuất kiến trúc: Kiến trúc nhiều tầng (Multi-Tier Architecture)

--Mô tả kiến trúc: Hệ thống sẽ được triển khai theo kiến trúc nhiều tầng gồm các thành phần chính:

-Presentation Layer (Tầng giao diện): Xử lý giao diện người dùng, tương tác qua các màn hình Windows-based hoặc web-based.

-Business Logic Layer (Tầng nghiệp vụ): Xử lý logic nghiệp vụ như đăng ký môn học, kiểm tra điều kiện tiên quyết, xử lý thanh toán, quản lý thông tin sinh viên.

-Data Access Layer (Tầng truy cập dữ liệu): Xử lý việc giao tiếp với cơ sở dữ liệu (CSDL), bao gồm CSDL kế thừa và các hệ thống mới.

-Database Layer (Tầng cơ sở dữ liệu): Chứa các cơ sở dữ liệu, bao gồm cơ sở dữ liệu khóa học (Ingres trên DEC VAX) và các cơ sở dữ liệu mới.

--Lý do lựa chọn kiến trúc này:

-Modular Design: Tách biệt các tầng giúp dễ bảo trì, mở rộng hệ thống.

-Tương thích hệ thống kế thừa: Tầng Data Access Layer sẽ quản lý truy cập đến hệ thống kế thừa (Ingres RDBMS).

-Khả năng mở rộng: Có thể dễ dàng thêm người dùng, thêm tính năng hoặc cải tiến hiệu năng mà không ảnh hưởng toàn bộ hệ thống.

-Bảo mật: Phân quyền truy cập ở từng tầng, đặc biệt trong việc bảo vệ dữ liệu nhạy cảm như thông tin sinh viên, bảng điểm.

-Đồng thời: Hỗ trợ 2000 người dùng truy cập đồng thời nhờ phân tầng và sử dụng cơ chế caching hoặc xử lý giữa các máy chủ.

--Ý nghĩa của từng thành phần

-Presentation Layer:

Giao tiếp với người dùng (sinh viên, giáo sư, nhân viên).

Đảm bảo tuân thủ các quy định UI (Windows 95/98 compliant).

Chịu trách nhiệm hiển thị thông tin như danh sách khóa học, bảng điểm, thông báo lỗi.

-Business Logic Layer:

Thực hiện các quy trình nghiệp vụ như kiểm tra điều kiện tiên quyết, xử lý yêu cầu đăng ký.

Gửi dữ liệu tới tầng Data Access và nhận kết quả.

Quyết định hành động khi xảy ra lỗi (ví dụ: khóa học đầy, đăng ký bị hủy).

-Data Access Layer:

Quản lý giao tiếp giữa hệ thống và các cơ sở dữ liệu.

Sử dụng JDBC để giao tiếp với hệ thống kế thừa.

Đảm bảo hiệu năng bằng cách sử dụng caching, giảm độ trễ khi truy vấn.

-Database Layer:

Lưu trữ dữ liệu về khóa học, sinh viên, bảng điểm và các thông tin khác.

Hỗ trợ cả cơ sở dữ liệu kế thừa và cơ sở dữ liệu mới.

Đảm bảo các tiêu chí về hiệu năng (latency < 10 giây) và đồng bộ.

--Biểu đồ Package Diagram được mô tả bằng PlantUML:

![Diagram](https://www.planttext.com/api/plantuml/png/V99DQiCm48NtFiMGVQvGyWSbnMb-JEYYT36M9wf88WMDH0YX9-kYH-eLQjbgwnWxskdDlE-XXxu_lqRiq3f_F2Gd57kK18EL9IRjq2cZ8SKBsG5S4oZFwulIXJapRETlKQ2ykdma__w9PwM96L8ZbMWHfiPR9jYGLEnibH5HcNYdmXy8LjQ8qgwqZ9D7YmL1vlEZAkLWQCRDq26CXQWIRxAUPfCfE0CfIHGN28ivCaNgShE0dR7mJEV6g4qEQWiRSNCjowBQr43BrkcVp1MoMHmCXmyzFVpMUM-bIwttUvzxnzDTGY-gDlKLq4shFHszZ4WNuUFz0000__y30000)

II. Cơ chế phân tích:

Dựa trên yêu cầu của hệ thống và đặc điểm kiến trúc, các cơ chế cần phân tích để giải quyết bài toán bao gồm:

1. Persistency (Lưu trữ dữ liệu)
--Cần giải quyết:

Dữ liệu cần được lưu trữ lâu dài, bao gồm thông tin sinh viên, khóa học, bảng điểm, và lịch sử giao dịch.

Phải hỗ trợ cả cơ sở dữ liệu kế thừa (Ingres trên DEC VAX) và cơ sở dữ liệu mới.

--Cơ chế đề xuất:

JDBC để kết nối với cơ sở dữ liệu quan hệ kế thừa.

ORM Framework (như Hibernate) để hỗ trợ cơ sở dữ liệu mới với các giao dịch phức tạp.

--Lý do:

JDBC tương thích với hệ thống kế thừa hiện tại.

ORM giúp giảm mã thủ công và tự động ánh xạ giữa lớp và bảng.

2. Distribution (Phân tán hệ thống)

--Cần giải quyết:

Tầng logic nghiệp vụ và truy cập dữ liệu cần phân tán để xử lý song song và đảm bảo hiệu năng khi có 2000 người dùng đồng thời.

--Cơ chế đề xuất:

Sử dụng Remote Method Invocation (RMI) để giao tiếp giữa các máy chủ.

Tích hợp thêm Load Balancer để cân bằng tải.

--Lý do:

RMI phù hợp để gọi các phương thức phân tán giữa các lớp nghiệp vụ.

Load Balancer giúp cải thiện khả năng mở rộng và phân phối tải.

3. Security (Bảo mật)

--Cần giải quyết:

Hệ thống cần đảm bảo tính bảo mật dữ liệu, đặc biệt là thông tin nhạy cảm như bảng điểm và thông tin thanh toán.

Xác thực và phân quyền phải ngăn người dùng không hợp lệ truy cập vào dữ liệu không thuộc quyền sở hữu.

--Cơ chế đề xuất:

Secure Login Mechanism: Mã hóa thông tin đăng nhập bằng SSL/TLS.

Role-Based Access Control (RBAC): Xác định quyền truy cập dựa trên vai trò (Sinh viên, Giáo sư, Quản trị).

Data Encryption: Mã hóa dữ liệu nhạy cảm trong cơ sở dữ liệu.

--Lý do:

RBAC đảm bảo quyền truy cập hợp lệ theo từng vai trò cụ thể.

Mã hóa bảo vệ dữ liệu cả khi lưu trữ và truyền tải.

4. Concurrency (Đồng thời)
   
--Cần giải quyết:

Hệ thống cần hỗ trợ 2000 người dùng truy cập đồng thời mà không gây ra lỗi hoặc xung đột.

--Cơ chế đề xuất:

Database Connection Pooling: Tái sử dụng kết nối đến cơ sở dữ liệu để giảm chi phí.

Optimistic Locking: Xử lý xung đột dữ liệu khi nhiều người dùng thao tác đồng thời.

--Lý do:

Connection Pooling cải thiện hiệu suất truy vấn cơ sở dữ liệu.

Optimistic Locking phù hợp cho các thao tác ít xảy ra xung đột nhưng cần hiệu năng cao.

5. Performance (Hiệu năng)

--Cần giải quyết:

Đảm bảo hệ thống xử lý 80% giao dịch trong vòng 2 phút và độ trễ truy vấn cơ sở dữ liệu không vượt quá 10 giây.

--Cơ chế đề xuất:

Caching: Lưu các kết quả truy vấn thường xuyên sử dụng tại tầng Business Logic.

Asynchronous Processing: Thực hiện xử lý song song cho các tác vụ dài.

--Lý do:

Caching giảm tải cho cơ sở dữ liệu.

Xử lý bất đồng bộ giúp nâng cao trải nghiệm người dùng.

6. Legacy System Integration (Tích hợp hệ thống kế thừa)

--Cần giải quyết:

Hệ thống phải truy cập và sử dụng dữ liệu từ CSDL khóa học hiện tại mà không được phép thay đổi.

--Cơ chế đề xuất:

Sử dụng Adapter Pattern: Tạo lớp chuyển đổi để giao tiếp với hệ thống kế thừa.

Tích hợp với JDBC để giao tiếp SQL qua Ingres.

--Lý do:

Adapter Pattern giúp kết nối với hệ thống cũ mà không thay đổi logic nghiệp vụ mới.

7. Usability (Tính dễ sử dụng)
    
--Cần giải quyết:

Giao diện thân thiện với người dùng, dễ truy cập và tuân thủ tiêu chuẩn Windows 95/98.

--Cơ chế đề xuất:

Thiết kế giao diện theo mô hình Model-View-Controller (MVC).

Tích hợp thông báo lỗi trực quan và hướng dẫn sử dụng trong giao diện.

--Lý do:

MVC giúp tách biệt logic giao diện và logic xử lý, dễ bảo trì.

Giao diện thân thiện giúp người dùng dễ thao tác và giảm thiểu lỗi.

--Danh sách cơ chế phù hợp

-Persistency: JDBC, ORM Framework.

-Distribution: RMI, Load Balancer.

-Security: SSL/TLS, RBAC, Data Encryption.

-Concurrency: Connection Pooling, Optimistic Locking.

-Performance: Caching, Asynchronous Processing.

-Legacy System Integration: Adapter Pattern, JDBC.

-Usability: MVC, trực quan hóa giao diện.

III. Phân tích ca sử dụng Payment:
   
--1. Phân tích các bước thực hiện trong ca sử dụng Payment:
   
--Ca sử dụng Payment mô tả quy trình thực hiện thanh toán cho nhân viên dựa trên các thông tin như:

-Loại nhân viên (theo giờ, lương tháng, hoa hồng).

-Thời gian làm việc (timecard).

-Đơn hàng (nếu có hoa hồng).

-Phương thức thanh toán (gửi thư, nhận trực tiếp, chuyển khoản).

2. Các lớp phân tích cho ca sử dụng Payment:

--Danh sách các lớp phân tích:

-PaymentProcessor: Lớp xử lý logic chính cho quy trình thanh toán.

-Employee: Lớp đại diện cho nhân viên, chứa thông tin cơ bản và phương thức tính lương.

-Timecard: Lớp lưu trữ thông tin giờ làm việc.

-PurchaseOrder: Lớp đại diện các đơn hàng (nếu là nhân viên hoa hồng).

-PaymentMethod: Lớp lưu thông tin phương thức thanh toán (nhận trực tiếp, gửi thư, chuyển khoản).

-PayrollDatabase: Lớp quản lý dữ liệu nhân viên, timecard, và đơn hàng.

-BankService: Lớp đại diện cho hệ thống ngân hàng xử lý giao dịch chuyển khoản.

-MailService: Lớp đại diện cho dịch vụ gửi thư trả lương qua bưu điện.

--biểu đồ Sequence mô tả hành vi của ca sử dụng Payment:

![Diagram](https://www.planttext.com/api/plantuml/png/b9HDJiCm48NtFiM8LP7e1IA4e0axgaOY5nYSeRNgs97j8FLiB3WILy1sajOcPK6bBEptvfiVZ_hz-VLe7HetT98XTzf0ZIUZfNngEw5OxoN1HO_AmOrNEbAkDfgJjThS05eudnRUGAdGuHjQYjPgatkUkrxg4usYF-Hg8phYQDgeDkKl_63umNDtfgMfZjtLOhVa3dfarDlSiK5rV2Np8VXOGJZdZYqAcJh2cR5qGB1-k4oW03EeILsrwEYMdRLWh3O5xCdDRTj6U_Dah3QmpbalmhhxsVl0fDOzl7iG8J_0VC_0_x8aNYc0e-I3zE1BWc3qMh0qPQnZ7h1D74qPouYGMQ_8-RvjIgXtaP2zGegfTnTCPbgmyfvVKQ8vfQPbRo5l-hQhsxzecIsQKBhy5eHVIs68kufwROMBjaNYi1e5zEFL15ZHz0PtW9qUb1lh86bfcIDkpbLqK0gmfDhoGFpuBsej-77ehtEJEUn9aHcNWMSv9hPgMVYIy12VRFbvb51g7qgEMlReGyAVnWy0003__mC0)

--Nhiệm vụ của từng lớp phân tích:

-PaymentProcessor:	Điều phối toàn bộ quy trình thanh toán: truy xuất dữ liệu, tính toán, gửi thanh toán.

-Employee:	Đại diện thông tin nhân viên, tính toán lương dựa trên timecard và đơn hàng.

-Timecard:	Cung cấp thông tin giờ làm việc của nhân viên để tính lương theo giờ.

-PurchaseOrder:	Cung cấp thông tin về doanh số để tính hoa hồng cho nhân viên hoa hồng.

-PaymentMethod:	Xác định phương thức thanh toán cho từng nhân viên (chuyển khoản, thư, trực tiếp).

-PayrollDatabase:	Lưu trữ và truy xuất thông tin liên quan đến nhân viên, timecard, và đơn hàng.

-BankService:	Xử lý giao dịch chuyển khoản với ngân hàng.

-MailService:	Quản lý việc gửi thư trả lương qua bưu điện.

IV. Phân tích ca sử dụng Maintain Timecard:

1. Phân tích yêu cầu ca sử dụng:

--Ca sử dụng Maintain Timecard mô tả quy trình nhân viên quản lý thông tin giờ làm việc. Các hành động chính:


-Nhân viên thêm thông tin giờ làm việc.

-Nhân viên sửa đổi thông tin giờ làm việc (trong kỳ thanh toán hiện tại và trước khi gửi đi).

-Nhân viên gửi thông tin timecard để xử lý.

2. Các lớp phân tích cho ca sử dụng:

--Danh sách các lớp phân tích:

-TimecardManager: Xử lý logic chính của quy trình quản lý timecard.

-Employee: Lớp đại diện nhân viên thực hiện việc thêm, sửa, gửi timecard.

-Timecard: Lớp lưu trữ chi tiết thông tin giờ làm việc của từng ngày.

-ProjectManagementDatabase: Hệ thống quản lý thông tin mã dự án (charge number).

-PayrollDatabase: Hệ thống lưu trữ và quản lý thông tin timecard.

--Biểu đồ quy trình thêm mới hoặc cập nhật Timecard:
![Diagram](https://www.planttext.com/api/plantuml/png/Z5DBRi8m4Dtx52DMGO8BP55H0WiMLAZD1OPu2cuTEx8Tr9ojYnwfLwWT9q1eg9fLPB-VtzZVdryBwz2ukfGC2wSDhCjAweQ8LNvP5A92vM2IYv8AD7oB2Wza9e0MklyXS8UDqLAkqE4UBRN0rN9ShDtCini1ez-eS56y9EK6Khkj5sDzHfW_z2bIq1MfNZcX3h7XC-3eQCewNA2ibYaSoFq1HkcWtmRw4DPP1lvRBM5-xTbZ64bB5mRNP45f5wajyye-pr8e37cZSuBeEi1rEIsUBh0ycp9Id36fTGMFd4CO61SnBAoLCu9Yqj6AaFC03BYczPp1KTV6pg0ueZdGKrtkoKnl0uVIKpYX586JNK6Jtxm07fRK4OLMpsHh6Vi83TzkWB1nhKMCjERp_ojxEuqnTQ7kwlU5fS25hIGsQsEqIIQRI85uR8Wsayx7pwATnsZRjjwNudBB1bSmd4RgudrizzxaHyFwMoPUc-Jyfk2bTNN4VSQ53nTUzWy0003__mC0)

--Nhiệm vụ của từng lớp phân tích:

-TimecardManager	Quản lý toàn bộ quy trình thêm, chỉnh sửa, và gửi timecard.

-Employee	Thực hiện các thao tác như thêm giờ, chỉnh sửa hoặc gửi timecard.

-Timecard	Lưu trữ chi tiết giờ làm việc, trạng thái gửi (submitted hoặc chưa gửi).

-PayrollDatabase	Lưu trữ thông tin timecard và truy xuất dữ liệu cho nhân viên.

-ProjectManagementDatabase	Xác thực mã dự án (charge number) để đảm bảo hợp lệ.

--Biều đồ lớp:
![Diagram](https://www.planttext.com/api/plantuml/png/f9HBQiCm48RtFeNmAeNa0gQ4G9j5eIs1zW9ZUN3KwX6aSI2KdgoB7gbNgFoGb3ZneeqNXf56___DZEoVh--L8x3KA9bn2SwnLw6GWwsUG4EDbdrap3zcXphip53jf3aWFbG5Uo4hT3rd5H0MxDw_RugeqHs5gchZjIPxcAMqETkQnhg22KrpnhTWQtnkL8asY7gXlH6zY6jA9IWIXAtFRA1U3qW3heXaNQX1uSd22HCDgedxk9ohEC-bpyZ3na2UZBiGFQ50x_ue7Dr6vcLlHa2D6nTsNQEbuU_JROu0bscJKHTUyafQ6pXO8wK_32MuCBaQwP_tpC4U_zBuZJLloAc_vyetUaIo1obQjxkZAcOJxIkDaGYw5Hz_Ful5CisuOBdgrlEBUUEM-7JW73qiwAehC9sBmlqyV2etca3eF8iVmx5tyF69ZPlodso9FnNwCOmrprQeg_Q_yGi00F__0m00)

--Thuộc tính và quan hệ giữa các lớp:

-Thuộc tính chính
Timecard:

date: Ngày tạo hoặc chỉnh sửa timecard.

entries: Danh sách các mục giờ làm việc.

status: Trạng thái của timecard (e.g., "Draft", "Submitted").

TimeEntry:

date: Ngày làm việc.

hours: Số giờ làm việc.

chargeNumber: Mã dự án liên quan.

Employee:

id: Mã nhân viên.

name: Tên nhân viên.

Quan hệ giữa các lớp

Employee có quan hệ "sử dụng" với TimecardManager.

TimecardManager quản lý các Timecard.

Timecard bao gồm nhiều TimeEntry.

TimecardManager xác thực thông tin mã dự án qua ProjectManagementDatabase.

-- Giải thích:

-TimecardManager là trung tâm xử lý toàn bộ quy trình quản lý timecard, tương tác với các lớp khác như Timecard và cơ sở dữ liệu.

-Timecard lưu trữ chi tiết từng mục giờ làm việc, dễ dàng cập nhật hoặc khóa khi đã hoàn tất.

-TimeEntry là thành phần nhỏ của Timecard, chi tiết hóa dữ liệu từng ngày.

-PayrollDatabase và ProjectManagementDatabase đóng vai trò hỗ trợ lưu trữ và xác thực
