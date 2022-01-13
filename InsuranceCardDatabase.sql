USE [master]
GO
/****** Object:  Database [InsuranceCard]    Script Date: 14/01/2022 00:34:23 ******/
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
/****** Object:  Table [dbo].[Accident]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accident](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AccidentDate] [datetime] NOT NULL,
	[Title] [nvarchar](600) NOT NULL,
	[CreatedDate] [datetime] NOT NULL,
	[Attachment] [nchar](300) NULL,
	[HumanDamage] [ntext] NULL,
	[VehicleDamage] [ntext] NOT NULL,
	[CompensationID] [int] NOT NULL,
 CONSTRAINT [PK_Accident] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Email] [nchar](300) NOT NULL,
	[Password] [varbinary](64) NULL,
	[Role] [bit] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Compensation]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Compensation](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[DriverName] [nvarchar](600) NOT NULL,
	[CreatedDate] [datetime] NOT NULL,
	[ResolveDate] [datetime] NOT NULL,
	[ResolveNote] [ntext] NULL,
	[Decision] [bit] NOT NULL,
	[Description] [ntext] NULL,
	[Attachment] [nchar](300) NULL,
	[ContractID] [int] NOT NULL,
 CONSTRAINT [PK_Compensation] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Contract]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contract](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ProductID] [int] NOT NULL,
	[CustomerID] [int] NOT NULL,
	[StartDate] [datetime] NOT NULL,
	[EndDate] [datetime] NOT NULL,
	[Status] [smallint] NOT NULL,
	[isDelete] [bit] NOT NULL,
	[ContractFee] [money] NOT NULL,
	[CancelComment] [nvarchar](600) NULL,
	[CancelReason] [nvarchar](600) NOT NULL,
	[CancelDate] [datetime] NOT NULL,
	[CancelRequestDate] [datetime] NOT NULL,
	[VehicleType] [nvarchar](300) NOT NULL,
	[Engine] [nvarchar](100) NOT NULL,
	[LicensePlate] [nchar](100) NOT NULL,
	[Color] [nchar](100) NOT NULL,
	[CertImage] [varbinary](max) NOT NULL,
	[Brand] [nchar](100) NOT NULL,
	[Owner] [nvarchar](600) NOT NULL,
	[Chassis] [nchar](100) NOT NULL,
	[RequestDate] [datetime] NOT NULL,
	[ResolveDate] [datetime] NOT NULL,
 CONSTRAINT [PK_Contract] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[AccountID] [int] NOT NULL,
	[FirstName] [nvarchar](300) NOT NULL,
	[LastName] [nvarchar](300) NOT NULL,
	[Address] [nvarchar](600) NOT NULL,
	[Dob] [date] NOT NULL,
	[JoinDate] [datetime] NOT NULL,
	[StaffID] [int] NOT NULL,
	[Phone] [nchar](15) NOT NULL,
	[PersonalID] [nchar](15) NOT NULL,
	[Province] [nvarchar](100) NOT NULL,
	[District] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer_Staff]    Script Date: 14/01/2022 00:34:23 ******/
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
/****** Object:  Table [dbo].[Moderator]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Moderator](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [nchar](100) NOT NULL,
	[Password] [binary](64) NOT NULL,
 CONSTRAINT [PK_Moderator] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Payment]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Payment](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PaidDate] [datetime] NULL,
	[PaymentMethod] [nchar](300) NOT NULL,
	[Note] [nchar](600) NULL,
	[Amout] [money] NOT NULL,
	[StartDate] [datetime] NULL,
	[ContractID] [int] NULL,
 CONSTRAINT [PK_Payment] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](300) NOT NULL,
	[Description] [nvarchar](300) NOT NULL,
	[Price] [money] NOT NULL,
	[ImageURL] [nchar](300) NOT NULL,
	[Status] [smallint] NOT NULL,
	[isDelete] [bit] NOT NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 14/01/2022 00:34:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Staff](
	[AccountID] [int] NOT NULL,
	[FirstName] [nvarchar](300) NOT NULL,
	[LastName] [nvarchar](300) NOT NULL,
	[Phone] [nchar](15) NOT NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Accident] ADD  CONSTRAINT [DF_Accident_CreatedDate]  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_Status]  DEFAULT ((1)) FOR [Status]
GO
ALTER TABLE [dbo].[Compensation] ADD  CONSTRAINT [DF_Compensation_CreatedDate]  DEFAULT (getdate()) FOR [CreatedDate]
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
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_Account_Staff] FOREIGN KEY([ID])
REFERENCES [dbo].[Staff] ([AccountID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_Account_Staff]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_Customer_Account] FOREIGN KEY([ID])
REFERENCES [dbo].[Customer] ([AccountID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_Customer_Account]
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
USE [master]
GO
ALTER DATABASE [InsuranceCard] SET  READ_WRITE 
GO
