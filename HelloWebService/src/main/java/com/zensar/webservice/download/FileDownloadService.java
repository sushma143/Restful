package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService {
		private static final String textFile="D:\\sample.txt";
		private static final String imageFile="C:\\Users\\TRG\\Desktop\\Sushma Kumari\\CarreerSolution\\img\\i1.jpg";
		private static final String pdfFile="C:\\Users\\TRG\\Desktop\\Shuruwat\\sample.pdf";
		@GET
		@Path("/text")
		@Produces("text/txt")
		public Response getTextFile() {
			File file=new File(textFile);
			ResponseBuilder builder=Response.ok(file);
			builder.header("Content-Disposition","attachment;filename=hello.txt");
			return builder.build();
		}
		@GET
		@Path("/images")
		@Produces("image/jpg")
		public Response getImageFile() {
			File file=new File(imageFile);
			ResponseBuilder builder=Response.ok(file);
			builder.header("Content-Disposition","attachment;filename=beauty.jpg");
			return builder.build();
		}
		@GET
		@Path("/pdf")
		@Produces("application/pdf")
		public Response getPdfFile() {
			File file=new File(pdfFile);
			ResponseBuilder builder=Response.ok(file);
			builder.header("Content-Disposition","attachment;filename=yoursDoc.jpg");
			return builder.build();
		}
		
}
