package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class MassaDeDados {
    //caminho para o arquivo excel
    String massaDeDados = "src/test/resources/testData/massateste.xlsx";

    public String inserirCep(){

        try {
            FileInputStream arquivo = new FileInputStream(new File(massaDeDados));
            //abre o arquivo excel e cria uma instnância de planilha
            Workbook planilha = new XSSFWorkbook(arquivo);

            //seleciona a prmeira planilha
            org.apache.poi.ss.usermodel.Sheet abaPlanilha = planilha.getSheetAt(0);

            for(Row linha : abaPlanilha){

                Cell celula = linha.getCell(0); //obtem a primeira célula da linha

                //verifica o tipo da celula
                switch (celula.getCellType()){
                    case STRING:
                        //se for uma celula tipo texto, retorna o valor como cep
                        return celula.getStringCellValue();
                    case NUMERIC:
                        return String.valueOf((int)celula.getNumericCellValue());
                }
            }
        }catch (Exception e){
            System.out.println("erro ao ler planilha");

        }

        return "";
    }
}
