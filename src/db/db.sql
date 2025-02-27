USE [master]
GO
/****** Object:  Database [KhachSan]    Script Date: 11/13/2023 9:59:27 PM ******/
CREATE DATABASE [KhachSan]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'KhachSan', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\KhachSan.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'KhachSan_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\KhachSan_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [KhachSan] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [KhachSan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [KhachSan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [KhachSan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [KhachSan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [KhachSan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [KhachSan] SET ARITHABORT OFF 
GO
ALTER DATABASE [KhachSan] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [KhachSan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [KhachSan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [KhachSan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [KhachSan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [KhachSan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [KhachSan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [KhachSan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [KhachSan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [KhachSan] SET  ENABLE_BROKER 
GO
ALTER DATABASE [KhachSan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [KhachSan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [KhachSan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [KhachSan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [KhachSan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [KhachSan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [KhachSan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [KhachSan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [KhachSan] SET  MULTI_USER 
GO
ALTER DATABASE [KhachSan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [KhachSan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [KhachSan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [KhachSan] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [KhachSan] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [KhachSan] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [KhachSan] SET QUERY_STORE = ON
GO
ALTER DATABASE [KhachSan] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [KhachSan]
GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDV] [int] IDENTITY(1,1) NOT NULL,
	[TenDV] [nvarchar](100) NOT NULL,
	[DonGia] [float] NULL,
	[MaLDV] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DichVuPhong]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVuPhong](
	[MaDVP] [int] IDENTITY(1,1) NOT NULL,
	[MaPDPhong] [int] NULL,
	[MaDV] [int] NULL,
	[SoLuong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDVP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[CCCD] [varchar](12) NOT NULL,
	[HoTen] [nvarchar](100) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NULL,
	[SoDienThoai] [nvarchar](11) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CCCD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiDichVu]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiDichVu](
	[MaLDV] [nvarchar](50) NOT NULL,
	[TenDV] [nvarchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiPhong] [nvarchar](100) NOT NULL,
	[GiaTheoGio] [float] NULL,
	[GiaTheoNgay] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NULL,
	[CCCD] [varchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[SoDienThoai] [nvarchar](11) NOT NULL,
	[VaiTro] [bit] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuDatPhong]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuDatPhong](
	[MaPDP] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](12) NULL,
	[MaPhong] [nvarchar](20) NULL,
	[NgayGioNhan] [datetime] NOT NULL,
	[NgayGioTra] [datetime] NULL,
	[TongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPDP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 11/13/2023 9:59:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [nvarchar](20) NOT NULL,
	[TrangThai] [int] NULL,
	[MaLoaiPhong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[DichVu] ON 

INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (1, N'Bún bò Huế', 30000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (2, N'Hũ tiếu gõ', 25000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (3, N'Mì 2 trứng', 17000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (12, N'Cơm sườn', 30000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (13, N'Gà rán', 30000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (14, N'Mì xào bò', 25000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (16, N'Mì 2 vắt 1 trứng', 20000, N'ThucAn')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (17, N'Sting', 15000, N'NuocUong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (18, N'Coca Cola', 15000, N'NuocUong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (19, N'Pepsi', 15000, N'NuocUong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (20, N'Bò cụn', 20000, N'NuocUong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (21, N'Trà ô lông Tea+', 15000, N'NuocUong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (22, N'Giặt ủi', 150000, N'DVPhong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (23, N'Đặt xe', 10000, N'DVPhong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (24, N'Đánh thức', 10000, N'DVPhong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (25, N'Dịch vụ phòng', 20000, N'DVPhong')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [DonGia], [MaLDV]) VALUES (26, N'Giữ trẻ', 100000, N'DVPhong')
SET IDENTITY_INSERT [dbo].[DichVu] OFF
GO
SET IDENTITY_INSERT [dbo].[DichVuPhong] ON 

INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (1, 1, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (2, 1, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (3, 1, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (4, 1, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (5, 2, 13, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (6, 2, 25, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (7, 2, 22, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (8, 2, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (9, 3, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (10, 3, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (11, 3, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (12, 3, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (13, 4, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (14, 4, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (15, 4, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (16, 4, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (17, 5, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (18, 5, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (19, 5, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (20, 5, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (21, 6, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (22, 6, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (23, 6, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (24, 6, 14, 3)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (25, 7, 1, 2)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (26, 7, 2, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (27, 7, 3, 1)
INSERT [dbo].[DichVuPhong] ([MaDVP], [MaPDPhong], [MaDV], [SoLuong]) VALUES (28, 7, 14, 3)
SET IDENTITY_INSERT [dbo].[DichVuPhong] OFF
GO
INSERT [dbo].[KhachHang] ([CCCD], [HoTen], [NgaySinh], [GioiTinh], [SoDienThoai]) VALUES (N'123456789123', N'Nguyễn Văn Anh', CAST(N'1990-01-15' AS Date), 1, N'0987654321')
INSERT [dbo].[KhachHang] ([CCCD], [HoTen], [NgaySinh], [GioiTinh], [SoDienThoai]) VALUES (N'234567890653', N'Hồ Văn Hậu', CAST(N'1988-12-01' AS Date), 1, N'0965432109')
INSERT [dbo].[KhachHang] ([CCCD], [HoTen], [NgaySinh], [GioiTinh], [SoDienThoai]) VALUES (N'456789123325', N'Lê Văn Cương', CAST(N'2000-08-10' AS Date), 1, N'0978965432')
INSERT [dbo].[KhachHang] ([CCCD], [HoTen], [NgaySinh], [GioiTinh], [SoDienThoai]) VALUES (N'789123456564', N'Phạm Thị Dung', CAST(N'1996-03-25' AS Date), 0, N'0901234567')
INSERT [dbo].[KhachHang] ([CCCD], [HoTen], [NgaySinh], [GioiTinh], [SoDienThoai]) VALUES (N'987654321321', N'Trần Thị Nghè', CAST(N'1985-05-20' AS Date), 0, N'0912345678')
GO
INSERT [dbo].[LoaiDichVu] ([MaLDV], [TenDV]) VALUES (N'DVPhong', N'Dịch vụ phòng')
INSERT [dbo].[LoaiDichVu] ([MaLDV], [TenDV]) VALUES (N'NuocUong', N'Nước uống')
INSERT [dbo].[LoaiDichVu] ([MaLDV], [TenDV]) VALUES (N'ThucAn', N'Thức ăn')
GO
SET IDENTITY_INSERT [dbo].[LoaiPhong] ON 

INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaTheoGio], [GiaTheoNgay]) VALUES (1, N'Đơn', 40000, 400000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaTheoGio], [GiaTheoNgay]) VALUES (2, N'Đôi', 50000, 500000)
SET IDENTITY_INSERT [dbo].[LoaiPhong] OFF
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [NgaySinh], [GioiTinh], [CCCD], [Email], [SoDienThoai], [VaiTro]) VALUES (N'LanPN', N'123', N'Phạm Ngọc Lân', CAST(N'2004-06-04' AS Date), 1, N'094204302099', N'lanpnps35575@fpt.edu.vn', N'0826515237', 1)
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [NgaySinh], [GioiTinh], [CCCD], [Email], [SoDienThoai], [VaiTro]) VALUES (N'MinhTN', N'123', N'Trần Ngọc Minh', CAST(N'2004-02-23' AS Date), 1, N'048204238472', N'minhtnps38272@fpt.edu.vn', N'0938231273', 1)
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [NgaySinh], [GioiTinh], [CCCD], [Email], [SoDienThoai], [VaiTro]) VALUES (N'AnhNN', N'123', N'Nguyễn Ngọc Anh', CAST(N'2003-04-25' AS Date), 0, N'092203394384', N'anhnn123@gmail.com', N'0938417233', 0)
GO
SET IDENTITY_INSERT [dbo].[PhieuDatPhong] ON 

INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (1, N'123456789123', N'P101', CAST(N'2022-11-12T18:20:20.000' AS DateTime), CAST(N'2022-11-13T12:00:00.000' AS DateTime), 500000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (2, N'123456789123', N'P101', CAST(N'2022-11-17T21:25:25.120' AS DateTime), CAST(N'2022-11-18T21:25:25.120' AS DateTime), 850000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (3, N'123456789123', N'P102', CAST(N'2022-05-17T21:25:25.120' AS DateTime), CAST(N'2022-05-17T21:25:25.120' AS DateTime), 750000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (4, N'234567890653', N'P103', CAST(N'2022-05-17T21:25:25.120' AS DateTime), CAST(N'2022-05-17T21:25:25.120' AS DateTime), 650000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (5, N'234567890653', N'P104', CAST(N'2022-05-17T21:25:25.120' AS DateTime), CAST(N'2022-05-17T21:25:25.120' AS DateTime), 800000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (6, N'234567890653', N'P105', CAST(N'2022-12-05T21:25:25.120' AS DateTime), CAST(N'2022-12-06T21:25:25.120' AS DateTime), 900000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (7, N'456789123325', N'P106', CAST(N'2022-12-05T21:25:25.120' AS DateTime), CAST(N'2022-12-06T21:25:25.120' AS DateTime), 1000000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (8, N'456789123325', N'P107', CAST(N'2022-12-05T21:25:25.120' AS DateTime), CAST(N'2022-12-06T21:25:25.120' AS DateTime), 1200000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (9, N'456789123325', N'P108', CAST(N'2023-11-17T21:25:25.120' AS DateTime), CAST(N'2023-11-19T21:25:25.120' AS DateTime), 540000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (10, N'456789123325', N'P109', CAST(N'2023-11-17T21:25:25.120' AS DateTime), CAST(N'2023-11-19T21:25:25.120' AS DateTime), 670000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (11, N'789123456564', N'P201', CAST(N'2023-11-17T21:25:25.120' AS DateTime), CAST(N'2023-11-19T21:25:25.120' AS DateTime), 894000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (12, N'789123456564', N'P101', CAST(N'2023-05-24T21:28:04.960' AS DateTime), CAST(N'2023-05-25T21:28:04.960' AS DateTime), 450000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (13, N'789123456564', N'P102', CAST(N'2023-05-24T21:28:04.960' AS DateTime), CAST(N'2023-05-25T21:28:04.960' AS DateTime), 305000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (14, N'789123456564', N'P103', CAST(N'2023-05-24T21:28:04.960' AS DateTime), CAST(N'2023-05-25T21:28:04.960' AS DateTime), 958000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (15, N'987654321321', N'P104', CAST(N'2023-11-20T21:28:04.960' AS DateTime), CAST(N'2023-11-23T21:28:04.960' AS DateTime), 350000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (16, N'987654321321', N'P105', CAST(N'2023-11-20T21:28:04.960' AS DateTime), CAST(N'2023-11-23T21:28:04.960' AS DateTime), 540000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (17, N'987654321321', N'P106', CAST(N'2023-05-30T21:28:04.960' AS DateTime), CAST(N'2023-06-01T21:28:04.960' AS DateTime), 900000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (18, N'456789123325', N'P107', CAST(N'2023-05-30T21:28:04.960' AS DateTime), CAST(N'2023-06-01T21:28:04.960' AS DateTime), 650000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (19, N'987654321321', N'P108', CAST(N'2023-11-20T21:28:04.960' AS DateTime), CAST(N'2023-11-23T21:28:04.960' AS DateTime), 345400)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (20, N'456789123325', N'P109', CAST(N'2023-11-20T21:28:04.960' AS DateTime), CAST(N'2023-11-23T21:28:04.960' AS DateTime), 495000)
INSERT [dbo].[PhieuDatPhong] ([MaPDP], [MaKH], [MaPhong], [NgayGioNhan], [NgayGioTra], [TongTien]) VALUES (21, N'456789123325', N'P201', CAST(N'2023-11-20T21:28:04.960' AS DateTime), CAST(N'2023-11-23T21:28:04.960' AS DateTime), 984000)
SET IDENTITY_INSERT [dbo].[PhieuDatPhong] OFF
GO
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P101', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P102', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P103', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P104', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P105', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P106', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P107', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P108', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P109', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P201', 0, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P202', 1, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P203', 1, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P204', 2, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P205', 2, 1)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P206', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P208', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P209', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P210', 0, 2)
INSERT [dbo].[Phong] ([MaPhong], [TrangThai], [MaLoaiPhong]) VALUES (N'P211', 0, 2)
GO
ALTER TABLE [dbo].[DichVu] ADD  DEFAULT ((0)) FOR [DonGia]
GO
ALTER TABLE [dbo].[DichVuPhong] ADD  DEFAULT ((1)) FOR [SoLuong]
GO
ALTER TABLE [dbo].[LoaiPhong] ADD  DEFAULT ((0)) FOR [GiaTheoGio]
GO
ALTER TABLE [dbo].[LoaiPhong] ADD  DEFAULT ((0)) FOR [GiaTheoNgay]
GO
ALTER TABLE [dbo].[PhieuDatPhong] ADD  DEFAULT (getdate()) FOR [NgayGioNhan]
GO
ALTER TABLE [dbo].[Phong] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[DichVu]  WITH CHECK ADD FOREIGN KEY([MaLDV])
REFERENCES [dbo].[LoaiDichVu] ([MaLDV])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DichVuPhong]  WITH CHECK ADD FOREIGN KEY([MaPDPhong])
REFERENCES [dbo].[PhieuDatPhong] ([MaPDP])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DichVuPhong]  WITH CHECK ADD FOREIGN KEY([MaDV])
REFERENCES [dbo].[DichVu] ([MaDV])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PhieuDatPhong]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PhieuDatPhong]  WITH CHECK ADD FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([CCCD])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
ON DELETE SET NULL
GO
ALTER TABLE [dbo].[DichVu]  WITH CHECK ADD CHECK  (([DonGia]>=(0)))
GO
ALTER TABLE [dbo].[DichVuPhong]  WITH CHECK ADD CHECK  (([Soluong]>=(1)))
GO
ALTER TABLE [dbo].[LoaiPhong]  WITH CHECK ADD CHECK  (([GiaTheoGio]>=(0)))
GO
ALTER TABLE [dbo].[LoaiPhong]  WITH CHECK ADD CHECK  (([GiaTheoNgay]>=(0)))
GO
USE [master]
GO
ALTER DATABASE [KhachSan] SET  READ_WRITE 
GO
