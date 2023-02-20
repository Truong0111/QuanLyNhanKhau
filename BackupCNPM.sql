-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cnpm
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chung_minh_thu`
--
use cnpm;

DROP TABLE IF EXISTS `chung_minh_thu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chung_minh_thu` (
  `ID` int NOT NULL ,
  `idNhanKhau` int NOT NULL,
  `soCMT` varchar(12) NOT NULL,
  `ngayCap` date,
  `noiCap` varchar(100),
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau_idx` (`idNhanKhau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chung_minh_thu`
--

LOCK TABLES `chung_minh_thu` WRITE;
/*!40000 ALTER TABLE `chung_minh_thu` DISABLE KEYS */;
/*!40000 ALTER TABLE `chung_minh_thu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinh_chinh`
--

DROP TABLE IF EXISTS `dinh_chinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dinh_chinh` (
  `ID` int NOT NULL ,
  `idHoKhau` int NOT NULL,
  `thongTinThayDoi` varchar(100) NOT NULL,
  `thayDoiTu` varchar(100) NOT NULL,
  `thayDoiThanh` varchar(100) NOT NULL,
  `ngayThayDoi` date NOT NULL,
  `nguoiThayDoi` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idHoKhau_idx` (`idHoKhau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinh_chinh`
--

LOCK TABLES `dinh_chinh` WRITE;
/*!40000 ALTER TABLE `dinh_chinh` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinh_chinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gia_dinh`
--

DROP TABLE IF EXISTS `gia_dinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gia_dinh` (
  `ID` int NOT NULL ,
  `idNhanKhauGiaDinh` int NOT NULL,
  `hoTen` varchar(100) NOT NULL,
  `namSInh` date NOT NULL,
  `gioiTinh` varchar(100) NOT NULL,
  `quanHeVoiNhanKhau` varchar(100) NOT NULL,
  `ngheNghiep` varchar(100) NOT NULL,
  `diaChiHientai` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau_idx` (`idNhanKhauGiaDinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gia_dinh`
--

LOCK TABLES `gia_dinh` WRITE;
/*!40000 ALTER TABLE `gia_dinh` DISABLE KEYS */;
/*!40000 ALTER TABLE `gia_dinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ho_khau`
--

DROP TABLE IF EXISTS `ho_khau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ho_khau` (
  `ID` int NOT NULL ,
  `maHoKhau` int NOT NULL,
  `idChuho` int NOT NULL,
  `maKhuVuc` varchar(100) NOT NULL,
  `diaChi` varchar(100) NOT NULL,
  `ngayLap` date NOT NULL,
  `ngayChuyenDi` date NOT NULL,
  `lyDoChuyen` text NOT NULL,
  `nguoiThucHien` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idChuHo_idx` (`idChuho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ho_khau`
--

LOCK TABLES `ho_khau` WRITE;
/*!40000 ALTER TABLE `ho_khau` DISABLE KEYS */;
/*!40000 ALTER TABLE `ho_khau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khai_tu`
--

DROP TABLE IF EXISTS `khai_tu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khai_tu` (
  `ID` int  NOT NULL ,
  `soGiayKhaiTu` varchar(100) NOT NULL,
  `idNguoiKhaiTu` int NOT NULL,
  `idNguoiChet` int NOT NULL,
  `ngayKhai` date NOT NULL,
  `ngayChet` date NOT NULL,
  `lyDoChet` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`) ,
  KEY `idNguoiKhaiTu_idx` (`idNguoiKhaiTu`),
  KEY `idNguoiChet_idx` (`idNguoiChet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khai_tu`
--

LOCK TABLES `khai_tu` WRITE;
/*!40000 ALTER TABLE `khai_tu` DISABLE KEYS */;
/*!40000 ALTER TABLE `khai_tu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoi_bi_covid`
--

DROP TABLE IF EXISTS `nguoi_bi_covid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nguoi_bi_covid` (
  `ID` int NOT NULL,
  `idNhanKhauCovid` int NOT NULL,
  `ngayKhaiBao` date NOT NULL,
  `hoTen` varchar(100) NOT NULL,
  `bietDanh` varchar(100) NOT NULL,
  `namSinh` varchar(100) NOT NULL,
  `gioiTinh` varchar(100) NOT NULL,
  `noiSinh` varchar(100) NOT NULL,
  `nguyenQuan` varchar(100) NOT NULL,
  `noiThuongTru` varchar(100) NOT NULL,
  `diaChiHienNay` varchar(100) NOT NULL,
  `soCMT` varchar(12) NOT NULL,
  `tongSoMuiTiem` int NOT NULL,
  `ngayTiem` date NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhauCovid_idx` (`idNhanKhauCovid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoi_bi_covid`
--

LOCK TABLES `nguoi_bi_covid` WRITE;
/*!40000 ALTER TABLE `nguoi_bi_covid` DISABLE KEYS */;
/*!40000 ALTER TABLE `nguoi_bi_covid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_khau`
--

DROP TABLE IF EXISTS `nhan_khau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_khau` (
  `ID` int NOT NULL ,
  `maNhanKhau` int NOT NULL,
  `hoTen` varchar(100) NOT NULL ,
  `bietDanh` varchar(100) DEFAULT NULL,
  `namSinh` date NOT NULL,
  `gioiTinh` varchar(100) NOT NULL,
  `noiSinh` varchar(100) ,
  `nguyenQuan` varchar(100) NOT NULL,
  `danToc` varchar(100) NOT NULL,
  `tonGiao` varchar(100) NOT NULL,
  `quocTich` varchar(100) NOT NULL,
  `soHoChieu` varchar(100) DEFAULT NULL,
  `noiThuongTru` varchar(100) NOT NULL,
  `diaChiHienNay` varchar(100) NOT NULL,
  `trinhDoHocVan` varchar(100) NOT NULL,
  `TrinhDoChuyenMon` varchar(100) NOT NULL,
  `bietTiengDanToc` varchar(100) NOT NULL,
  `trinhDoNgoaiNgu` varchar(100) NOT NULL,
  `ngheNghiep` varchar(100) NOT NULL,
  `noiLamViec` varchar(100) NOT NULL,
  `tienAn` varchar(100),
  `ngayChuyenDen` date,
  `lyDoChuyenDen` varchar(100),
  `ngayChuyenDi` date,
  `lyDoChuyenDi` varchar(100),
  `diaChiMoi` varchar(100),
  `ngayTao` date NOT NULL,
  `idNguoiTao` int NOT NULL,
  `ngayXoa` date,
  `idNguoiXoa` int,
  `lyDoXoa` varchar(100),
  `ghiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`,`maNhanKhau`), 
  KEY `idNguoiTao_idx` (`idNguoiTao`),
  KEY `idNguoiXoa_idx` (`idNguoiXoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_khau`
--

LOCK TABLES `nhan_khau` WRITE;
/*!40000 ALTER TABLE `nhan_khau` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhan_khau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tam_tru`
--

DROP TABLE IF EXISTS `tam_tru`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tam_tru` (
  `ID` int NOT NULL,
  `idNhanKhauTamTru` int NOT NULL,
  `maGiayTamTru` varchar(100) NOT NULL,
  `soDienThoaiNguoiDangKi` varchar(100) NOT NULL,
  `tuNgay` date NOT NULL,
  `denNgay` date NOT NULL,
  `lyDo` text NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau_idx` (`idNhanKhauTamTru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tam_tru`
--

LOCK TABLES `tam_tru` WRITE;
/*!40000 ALTER TABLE `tam_tru` DISABLE KEYS */;
/*!40000 ALTER TABLE `tam_tru` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tam_vang`
--

DROP TABLE IF EXISTS `tam_vang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tam_vang` (
  `ID` int NOT NULL ,
  `idNhanKhauTamVang` int NOT NULL,
  `maGiayTamVang` varchar(100) NOT NULL,
  `noiTamTru` varchar(100) NOT NULL,
  `tuNgay` date NOT NULL,
  `denNgay` date NOT NULL,
  `lyDo` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhauTamVang_idx` (`idNhanKhauTamVang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tam_vang`
--

LOCK TABLES `tam_vang` WRITE;
/*!40000 ALTER TABLE `tam_vang` DISABLE KEYS */;
/*!40000 ALTER TABLE `tam_vang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thanh_vien_cua_ho`
--

DROP TABLE IF EXISTS `thanh_vien_cua_ho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thanh_vien_cua_ho` (
  `idNhanKhauCuaHo` int NOT NULL ,
  `idHoKhauCuaHo` int NOT NULL,
  `quanheVoiChuHo` varchar(100) NOT NULL,
  PRIMARY KEY (`idNhanKhauCuaHo`,`idHoKhauCuaHo`),
  KEY `idHoKhauCuaHo_idx` (`idHoKhauCuaHo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thanh_vien_cua_ho`
--

LOCK TABLES `thanh_vien_cua_ho` WRITE;
/*!40000 ALTER TABLE `thanh_vien_cua_ho` DISABLE KEYS */;
/*!40000 ALTER TABLE `thanh_vien_cua_ho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieu_su`
--

DROP TABLE IF EXISTS `tieu_su`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tieu_su` (
  `ID` int NOT NULL,
  `idNhanKhauTieuSu` int NOT NULL,
  `tuNgay` date NOT NULL,
  `denNgay` date NOT NULL,
  `diaChi` varchar(100) NOT NULL,
  `ngheNghiep` varchar(100) NOT NULL,
  `noiLamViec` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhauTieuSu_idx` (`idNhanKhauTieuSu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieu_su`
--

LOCK TABLES `tieu_su` WRITE;
/*!40000 ALTER TABLE `tieu_su` DISABLE KEYS */;
/*!40000 ALTER TABLE `tieu_su` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL,
  `userName` varchar(100) NOT NULL,
  `passwd` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-16 12:54:56
