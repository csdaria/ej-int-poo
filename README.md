# Ejercicio Integracion 1 POO

Programa elaborado en Java sobre el cobro de una cantidad
en un datáfono.

## Descripción

Se trata de la aplicación de software de un datáfono en el que se comprueba una tarjeta de crédito, si el pago puede ser validado, los datos del titular de la tarjeta y, en el caso de que el pago sea efectuado, se genera un ticket con los datos de la operación y el nombre del titular de la tarjeta. 

## Uso

Paquete de práctica de ejercicio de Programación orientada a objetos que incluye los siguientes ejemplos:


**Persona:** contiene los atributos dni, nombre, apellido, telefono, mail; todos orientados a validar al titular de la tarjeta para permitir el pago. Incluye el método nombre completo como una concatenación de nombre y apellido para validar para dar base al titular de la tarjeta. 


**Entidad Financiera:** se trata de una clase enum con las entidades financieras que acepta el datáfono.

**Tarjeta de Crédito:** además, de enlazar con la entidad financiera, incluye atributos necesarios para validar la tarjeta como el número, el saldo disponible, la entidad bancaria y el titular, que sería un atributo de la clase persona.

Entre los métodos, se encuentra un toString con toda la información referente a la tarjeta; un método que comprueba si hay saldo disponible y, en caso afirmativo, uno que realiza el cobro y otro que devuelve el nombre completo del titular que realiza el pago.

**Ticket:** incluye los atributos de nombre y apellido, monto por cuota y monto total. Generará un ticket con la información del pago.

**Posnet:** se trata del datáfono en sí. Incluye los atributos estáticos de los recargos por cuotas y la cantidad mínima y máxima de cuotas. Contiene los métodos para validar los datos de la tarjeta, efectuar el pago y aplicar los recargos según las cuotas. Así, para efectuar el pago será necesario comprobar que los datos son válidos, que existe saldo disponible y el descuento, generando un nuevo ticket.  


**Principal**: contiene tests de prueba para comprobar su funcionamiento. Faltaría hacerlo de uso general para que el usuario pueda introducir los datos libremente en main haciendo uso de la clase Scanner y no a través de la introducción manual de parámetros.


```java

 Posnet posnet=new Posnet();
        Persona p = new Persona("45678123", "Pepa", "Gomez", "111111111", "pepe@fakemail.com");
        TarjetaDeCredito t= new TarjetaDeCredito("FakeBank", "1222222222", 15000, p , EntidadFinanciera.BIRZA);
       
         System.out.println("Tarjeta antes del pago: ");
         System.out.println(t);
         
         System.out.println("Ticket tras pagar... ");
         Ticket ticketGenerado=posnet.efectuarPago(t, -10000, 5);
         System.out.println(ticketGenerado);
        
         System.out.println("Tarjeta después del pago");
         System.out.println(t);

```

## Soporte

Consultar documentación. 
Para obtener más ayuda, contactar a cs.daria@proton.me

## Autor

csdaria

## Licencia 

CC - Para uso educativo
