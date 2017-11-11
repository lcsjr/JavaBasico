package com.javabasico.basico02.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Datas {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		System.out.println(hoje);

		System.out.println("Milisegundos desde 1 jan 1970: " + hoje.getTime());
		System.out.println(hoje.getDate()); // DEPRECIADO.
		System.out.println();
		
		/*==========================================================================================
		 * UTILIZANDO A CLASSE CALENDAR PARA DATAS.
		 ==========================================================================================*/
		Calendar toDay = Calendar.getInstance();
		int ano = toDay.get(Calendar.YEAR);
		int mes = toDay.get(Calendar.MONDAY);
		int dia = toDay.get(Calendar.DAY_OF_MONTH);
		int hora = toDay.get(Calendar.HOUR_OF_DAY);
		int min = toDay.get(Calendar.MINUTE);
		int sec = toDay.get(Calendar.SECOND);
		
		System.out.println(toDay);
		System.out.println("Ano: " + ano );
		System.out.println("Mês: " + mes ); // MES INICIA EM ZERO NO JAVA. EX: JANEIRO RETORNA 0, FEVEREIRO RETORNA 1, ETC.
		System.out.println("dia: " + dia );
		System.out.println("Hora: " + hora);
		System.out.println("Minutos: " + min);
		System.out.println("Segundos: " + sec);
		System.out.println();
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, min,sec ) ;
		
		System.out.println();
		
		// SOMANDO DATAS
		toDay.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println( "Somando mais 5 dias no dia de hoje é: " + toDay.get(Calendar.DAY_OF_MONTH) );
		System.out.println();
		
		/*==========================================================================================
		 * FORMATAÇÃO DE DATAS
		 ==========================================================================================*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");	
		Calendar data = new GregorianCalendar(2017, 11, 10, 23, 03, 45);
		
		System.out.println("Formatação da Data: " +sdf.format(data.getTime()));
		System.out.println();
		
		// String to Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaDataString = "10/11/2017";
		
		try {
			Date minhaData = sdf1.parse(minhaDataString);
			System.out.println(minhaData);
			System.out.println( sdf.format(minhaData) );
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println();
		/*==========================================================================================
		 * Locale
		 ==========================================================================================*/
		Locale locale = Locale.getDefault();
		System.out.println("Configuração do formato configurado no Sistema Operacional: "+ locale);
		
		// DEFININDO OU SETANDO UM LOCALE DEFAULT
		Locale br = new Locale("pt","Brazil");
		System.out.println(br);
		
		Locale.setDefault(br);
		System.out.println( Locale.getDefault());
	}

}
