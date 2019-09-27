package com.personal.wenp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	@RequestMapping("prueba")
		public class PruebaController{

   @RequestMapping("Hola")
	   public String  Hola() {
		   return "Hola";
		   
    } 
   @RequestMapping("Mundo")
   		public String Mundo() {
	   		return "Mundo";	   
   }
   @GetMapping("guardar")
   	public String Guard(Model m) {
	   //Mandamos parametros a la vista(Guardar) con el objeto de tipo model
	   String v="Soy otro parametro desde el controlador";
	   m.addAttribute("b",v);
	   
	   m.addAttribute("parametro","Soy un parametro desde el controlador");
	   return "guardar";
   }
   @PostMapping("Listar")
	   public String List() {
		   return "Listar";
	   }
//**************************************************
	   //Ruta para la vista
   @GetMapping("Numeros")
       public String operacion() {
	         return "Numeros";
   }
   @PostMapping("Numeros")
        /*public String procesar(Model m, HttpServletRequest request)*/
         public String procesar(Model m,
        		 @RequestParam("n1") Double n1,
        		 @RequestParam("n2")Double n2){
	   //recibiendo datos
	   //Double n1= Double.parseDouble(request.getParameter("n1"));
	   //Double n2= Double.parseDouble(request.getParameter("n2"));
	   m.addAttribute("resultado",(n1+n2));
	   m.addAttribute("resultado");
	   return "Numeros";
   }
}