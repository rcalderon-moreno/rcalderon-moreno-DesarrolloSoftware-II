
package com.eis.poo.clases.Genericos;

 public  class B implements  Comparable {
        private int a;
        private int b;        
        public B(int a, int b) { this.a = a; this.b = b;}        
        @Override
        public String toString() {
            return "B{" + "a=" + a + ", b=" + b + '}'+ " Referencia: " + super.toString();
        }

        @Override
        public int compareTo(Object obj) {
            if ( this == obj )
                return 1;
            if (  obj instanceof B )
                {
                    //Codigo correpondiente a comparar el contenido del objeto
                    B tmp = (B)obj;
                    if (this.a== tmp.a && this.b==tmp.b)
                        return 0;
                    else
                        return 1;
                }
            else
                        return 1;
        }
}
    
    
       


