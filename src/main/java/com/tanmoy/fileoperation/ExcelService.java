package com.tanmoy.fileoperation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.tanmoy.controller.Question;
import com.tanmoy.controller.Questionaire;

@Service
public class ExcelService {

	public ByteArrayInputStream export(Questionaire ques) throws IOException {
		try(
		        Workbook workbook = new XSSFWorkbook();
		        ByteArrayOutputStream out = new ByteArrayOutputStream();
		    ){
			//Workbook workbook = new XSSFWorkbook();
			
			Sheet sheet = workbook.createSheet("MapData");
			//sheet.setColumnWidth(0, 6000);
			//sheet.setColumnWidth(1, 4000);
			//populate path
			Row path = sheet.createRow(0);
			Cell pathCell = path.createCell(0);
			pathCell.setCellValue(ques.getPath());
			//populate name
			Row name = sheet.createRow(1);
			Cell nameCell = name.createCell(1);
			nameCell.setCellValue(ques.getPath());
			//populate header
			Row header = sheet.createRow(3);
			Cell headerCell1 = header.createCell(1);
			headerCell1.setCellValue("id");
			Cell headerCell2 = header.createCell(2);
			headerCell2.setCellValue("name");
			Cell headerCell3 = header.createCell(3);
			headerCell3.setCellValue("rating");
			//populate list of questions
			int counter = 4;
			if(!CollectionUtils.isEmpty(ques.getQuestions())) {
				for (Question question : ques.getQuestions()) {
					Row row = sheet.createRow(counter);
					Cell cell1 = row.createCell(1);
					cell1.setCellValue(question.getId());
					Cell cell2 = row.createCell(2);
					cell2.setCellValue(question.getId());
					Cell cell3 = row.createCell(3);
					cell3.setCellValue(question.getId());
					counter++;
				}
			}
			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
			
		}
		 
		//Row header = sheet.createRow(3);
		 
		//CellStyle headerStyle = workbook.createCellStyle();
		//headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		//headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 
		//XSSFFont font = ((XSSFWorkbook) workbook).createFont();
		//font.setFontName("Arial");
		//font.setFontHeightInPoints((short) 16);
		//font.setBold(true);
		//headerStyle.setFont(font);
		 
/*		Cell headerCell = header.createCell(0);
		headerCell.setCellValue("id");
		headerCell.setCellStyle(headerStyle);
		 
		headerCell = header.createCell(1);
		headerCell.setCellValue("name");
		headerCell.setCellStyle(headerStyle);
		
		headerCell = header.createCell(1);
		headerCell.setCellValue("rating");
		headerCell.setCellStyle(headerStyle);*/
	}
}
