Đề xuất kiến trúc: Kiến trúc nhiều tầng (Multi-Tier Architecture)
Mô tả kiến trúc: Hệ thống sẽ được triển khai theo kiến trúc nhiều tầng gồm các thành phần chính:
Presentation Layer (Tầng giao diện): Xử lý giao diện người dùng, tương tác qua các màn hình Windows-based hoặc web-based.
Business Logic Layer (Tầng nghiệp vụ): Xử lý logic nghiệp vụ như đăng ký môn học, kiểm tra điều kiện tiên quyết, xử lý thanh toán, quản lý thông tin sinh viên.
Data Access Layer (Tầng truy cập dữ liệu): Xử lý việc giao tiếp với cơ sở dữ liệu (CSDL), bao gồm CSDL kế thừa và các hệ thống mới.
Database Layer (Tầng cơ sở dữ liệu): Chứa các cơ sở dữ liệu, bao gồm cơ sở dữ liệu khóa học (Ingres trên DEC VAX) và các cơ sở dữ liệu mới.
Lý do lựa chọn kiến trúc này
Modular Design: Tách biệt các tầng giúp dễ bảo trì, mở rộng hệ thống.
Tương thích hệ thống kế thừa: Tầng Data Access Layer sẽ quản lý truy cập đến hệ thống kế thừa (Ingres RDBMS).
Khả năng mở rộng: Có thể dễ dàng thêm người dùng, thêm tính năng hoặc cải tiến hiệu năng mà không ảnh hưởng toàn bộ hệ thống.
Bảo mật: Phân quyền truy cập ở từng tầng, đặc biệt trong việc bảo vệ dữ liệu nhạy cảm như thông tin sinh viên, bảng điểm.
Đồng thời: Hỗ trợ 2000 người dùng truy cập đồng thời nhờ phân tầng và sử dụng cơ chế caching hoặc xử lý giữa các máy chủ.
Ý nghĩa của từng thành phần
Presentation Layer:

Giao tiếp với người dùng (sinh viên, giáo sư, nhân viên).
Đảm bảo tuân thủ các quy định UI (Windows 95/98 compliant).
Chịu trách nhiệm hiển thị thông tin như danh sách khóa học, bảng điểm, thông báo lỗi.
Business Logic Layer:

Thực hiện các quy trình nghiệp vụ như kiểm tra điều kiện tiên quyết, xử lý yêu cầu đăng ký.
Gửi dữ liệu tới tầng Data Access và nhận kết quả.
Quyết định hành động khi xảy ra lỗi (ví dụ: khóa học đầy, đăng ký bị hủy).
Data Access Layer:

Quản lý giao tiếp giữa hệ thống và các cơ sở dữ liệu.
Sử dụng JDBC để giao tiếp với hệ thống kế thừa.
Đảm bảo hiệu năng bằng cách sử dụng caching, giảm độ trễ khi truy vấn.
Database Layer:

Lưu trữ dữ liệu về khóa học, sinh viên, bảng điểm và các thông tin khác.
Hỗ trợ cả cơ sở dữ liệu kế thừa và cơ sở dữ liệu mới.
Đảm bảo các tiêu chí về hiệu năng (latency < 10 giây) và đồng bộ.
Biểu đồ Package Diagram được mô tả bằng PlantUML:
![Diagram](https://www.planttext.com/api/plantuml/png/V99DQiCm48NtFiMGVQvGyWSbnMb-JEYYT36M9wf88WMDH0YX9-kYH-eLQjbgwnWxskdDlE-XXxu_lqRiq3f_F2Gd57kK18EL9IRjq2cZ8SKBsG5S4oZFwulIXJapRETlKQ2ykdma__w9PwM96L8ZbMWHfiPR9jYGLEnibH5HcNYdmXy8LjQ8qgwqZ9D7YmL1vlEZAkLWQCRDq26CXQWIRxAUPfCfE0CfIHGN28ivCaNgShE0dR7mJEV6g4qEQWiRSNCjowBQr43BrkcVp1MoMHmCXmyzFVpMUM-bIwttUvzxnzDTGY-gDlKLq4shFHszZ4WNuUFz0000__y30000)

