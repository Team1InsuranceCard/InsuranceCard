USE [master]
GO
/****** Object:  Database [InsuranceCard]    Script Date: 19/01/2022 23:51:24 ******/
CREATE DATABASE [InsuranceCard]
GO
ALTER DATABASE [InsuranceCard] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [InsuranceCard].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [InsuranceCard] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [InsuranceCard] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [InsuranceCard] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [InsuranceCard] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [InsuranceCard] SET ARITHABORT OFF 
GO
ALTER DATABASE [InsuranceCard] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [InsuranceCard] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [InsuranceCard] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [InsuranceCard] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [InsuranceCard] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [InsuranceCard] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [InsuranceCard] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [InsuranceCard] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [InsuranceCard] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [InsuranceCard] SET  DISABLE_BROKER 
GO
ALTER DATABASE [InsuranceCard] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [InsuranceCard] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [InsuranceCard] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [InsuranceCard] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [InsuranceCard] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [InsuranceCard] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [InsuranceCard] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [InsuranceCard] SET RECOVERY FULL 
GO
ALTER DATABASE [InsuranceCard] SET  MULTI_USER 
GO
ALTER DATABASE [InsuranceCard] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [InsuranceCard] SET DB_CHAINING OFF 
GO
ALTER DATABASE [InsuranceCard] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [InsuranceCard] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [InsuranceCard] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [InsuranceCard] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'InsuranceCard', N'ON'
GO
ALTER DATABASE [InsuranceCard] SET QUERY_STORE = OFF
GO
USE [InsuranceCard]
GO
/****** Object:  Table [dbo].[Accident]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accident](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AccidentDate] [datetime] NULL,
	[Title] [nvarchar](600) NULL,
	[CreatedDate] [datetime] NULL,
	[Attachment] [nvarchar](300) NULL,
	[HumanDamage] [ntext] NULL,
	[VehicleDamage] [ntext] NULL,
	[CompensationID] [int] NULL,
 CONSTRAINT [PK_Accident] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Email] [nvarchar](300) NULL,
	[Password] [nvarchar](256) NULL,
	[Role] [bit] NULL,
	[Status] [smallint] NULL,
	[isDelete] [bit] NULL,
	[VerifiedCode] [nvarchar](50) NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Compensation]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Compensation](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[DriverName] [nvarchar](600) NULL,
	[CreatedDate] [datetime] NULL,
	[ResolveDate] [datetime] NULL,
	[ResolveNote] [ntext] NULL,
	[Decision] [bit] NULL,
	[Description] [ntext] NULL,
	[Attachment] [nvarchar](300) NULL,
	[ContractID] [int] NULL,
 CONSTRAINT [PK_Compensation] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Contract]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contract](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ProductID] [int] NOT NULL,
	[CustomerID] [int] NOT NULL,
	[StartDate] [datetime] NULL,
	[EndDate] [datetime] NULL,
	[Status] [smallint] NULL,
	[isDelete] [bit] NULL,
	[ContractFee] [money] NULL,
	[CancelComment] [nvarchar](600) NULL,
	[CancelReason] [nvarchar](600) NULL,
	[CancelDate] [datetime] NULL,
	[CancelRequestDate] [datetime] NULL,
	[VehicleType] [nvarchar](300) NULL,
	[Engine] [nvarchar](100) NULL,
	[LicensePlate] [nvarchar](100) NULL,
	[Color] [nvarchar](100) NULL,
	[CertImage] [varbinary](max) NULL,
	[Brand] [nvarchar](100) NULL,
	[Owner] [nvarchar](600) NULL,
	[Chassis] [nvarchar](100) NULL,
	[RequestDate] [datetime] NULL,
	[ResolveDate] [datetime] NULL,
 CONSTRAINT [PK_Contract] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[AccountID] [int] NOT NULL,
	[FirstName] [nvarchar](300) NULL,
	[LastName] [nvarchar](300) NULL,
	[Address] [nvarchar](600) NULL,
	[Dob] [date] NULL,
	[JoinDate] [datetime] NULL,
	[Phone] [nvarchar](50) NULL,
	[PersonalID] [nvarchar](50) NULL,
	[Province] [nvarchar](100) NULL,
	[District] [nvarchar](100) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer_Staff]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer_Staff](
	[CustomerID] [int] NOT NULL,
	[StaffID] [int] NOT NULL,
	[StartDate] [datetime] NULL,
	[EndDate] [datetime] NULL,
	[NextStaff] [int] NULL,
 CONSTRAINT [PK_Customer_Staff] PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC,
	[StaffID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Feature]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feature](
	[ID] [int] NOT NULL,
	[URL] [nvarchar](600) NULL,
 CONSTRAINT [PK_Feature] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Moderator]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Moderator](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [nvarchar](100) NULL,
	[Password] [nvarchar](255) NULL,
 CONSTRAINT [PK_Moderator] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Payment]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Payment](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PaidDate] [datetime] NULL,
	[PaymentMethod] [nvarchar](300) NULL,
	[Note] [nvarchar](600) NULL,
	[Amout] [money] NULL,
	[StartDate] [datetime] NULL,
	[ContractID] [int] NULL,
 CONSTRAINT [PK_Payment] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](300) NULL,
	[Description] [nvarchar](600) NULL,
	[Price] [money] NULL,
	[ImageURL] [nvarchar](300) NULL,
	[Status] [smallint] NULL,
	[isDelete] [bit] NULL,
	[ContentDetail] [ntext] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role_Feature]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role_Feature](
	[Role] [nchar](10) NOT NULL,
	[FeatureID] [int] NOT NULL,
 CONSTRAINT [PK_Role_Feature] PRIMARY KEY CLUSTERED 
(
	[Role] ASC,
	[FeatureID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 19/01/2022 23:51:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Staff](
	[AccountID] [int] NOT NULL,
	[FirstName] [nvarchar](300) NULL,
	[LastName] [nvarchar](300) NULL,
	[Phone] [nvarchar](50) NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Accident] ADD  CONSTRAINT [DF_Accident_CreatedDate]  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_Role]  DEFAULT ((0)) FOR [Role]
GO
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_Status]  DEFAULT ((1)) FOR [Status]
GO
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_isDelete]  DEFAULT ((0)) FOR [isDelete]
GO
ALTER TABLE [dbo].[Compensation] ADD  CONSTRAINT [DF_Compensation_CreatedDate]  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[Contract] ADD  CONSTRAINT [DF_Contract_Status]  DEFAULT ((2)) FOR [Status]
GO
ALTER TABLE [dbo].[Contract] ADD  CONSTRAINT [DF_Contract_isDelete]  DEFAULT ((0)) FOR [isDelete]
GO
ALTER TABLE [dbo].[Customer] ADD  CONSTRAINT [DF_Customer_JoinDate]  DEFAULT (getdate()) FOR [JoinDate]
GO
ALTER TABLE [dbo].[Customer_Staff] ADD  CONSTRAINT [DF_Customer_Staff_StartDate]  DEFAULT (getdate()) FOR [StartDate]
GO
ALTER TABLE [dbo].[Payment] ADD  CONSTRAINT [DF_Payment_StartDate]  DEFAULT (getdate()) FOR [StartDate]
GO
ALTER TABLE [dbo].[Product] ADD  CONSTRAINT [DF_Product_isDelete]  DEFAULT ((0)) FOR [isDelete]
GO
ALTER TABLE [dbo].[Accident]  WITH CHECK ADD  CONSTRAINT [FK_Accident_Compensation] FOREIGN KEY([CompensationID])
REFERENCES [dbo].[Compensation] ([ID])
GO
ALTER TABLE [dbo].[Accident] CHECK CONSTRAINT [FK_Accident_Compensation]
GO
ALTER TABLE [dbo].[Compensation]  WITH CHECK ADD  CONSTRAINT [FK_Compensation_Contract] FOREIGN KEY([ContractID])
REFERENCES [dbo].[Contract] ([ID])
GO
ALTER TABLE [dbo].[Compensation] CHECK CONSTRAINT [FK_Compensation_Contract]
GO
ALTER TABLE [dbo].[Contract]  WITH CHECK ADD  CONSTRAINT [FK_Contract_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([AccountID])
GO
ALTER TABLE [dbo].[Contract] CHECK CONSTRAINT [FK_Contract_Customer]
GO
ALTER TABLE [dbo].[Contract]  WITH CHECK ADD  CONSTRAINT [FK_Contract_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ID])
GO
ALTER TABLE [dbo].[Contract] CHECK CONSTRAINT [FK_Contract_Product]
GO
ALTER TABLE [dbo].[Customer]  WITH CHECK ADD  CONSTRAINT [FK_Customer_Account1] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([ID])
GO
ALTER TABLE [dbo].[Customer] CHECK CONSTRAINT [FK_Customer_Account1]
GO
ALTER TABLE [dbo].[Customer_Staff]  WITH CHECK ADD  CONSTRAINT [FK_Customer_Staff_Customer] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([AccountID])
GO
ALTER TABLE [dbo].[Customer_Staff] CHECK CONSTRAINT [FK_Customer_Staff_Customer]
GO
ALTER TABLE [dbo].[Customer_Staff]  WITH CHECK ADD  CONSTRAINT [FK_Customer_Staff_Staff] FOREIGN KEY([StaffID])
REFERENCES [dbo].[Staff] ([AccountID])
GO
ALTER TABLE [dbo].[Customer_Staff] CHECK CONSTRAINT [FK_Customer_Staff_Staff]
GO
ALTER TABLE [dbo].[Payment]  WITH CHECK ADD  CONSTRAINT [FK_Payment_Contract] FOREIGN KEY([ContractID])
REFERENCES [dbo].[Contract] ([ID])
GO
ALTER TABLE [dbo].[Payment] CHECK CONSTRAINT [FK_Payment_Contract]
GO
ALTER TABLE [dbo].[Role_Feature]  WITH CHECK ADD  CONSTRAINT [FK_Role_Feature_Feature] FOREIGN KEY([FeatureID])
REFERENCES [dbo].[Feature] ([ID])
GO
ALTER TABLE [dbo].[Role_Feature] CHECK CONSTRAINT [FK_Role_Feature_Feature]
GO
ALTER TABLE [dbo].[Staff]  WITH CHECK ADD  CONSTRAINT [FK_Staff_Account] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([ID])
GO
ALTER TABLE [dbo].[Staff] CHECK CONSTRAINT [FK_Staff_Account]
GO
USE [master]
GO
ALTER DATABASE [InsuranceCard] SET  READ_WRITE 
GO
