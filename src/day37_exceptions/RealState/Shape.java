package day37_exceptions.RealState;


import java.lang.reflect.Array;
import java.util.ArrayList;


    public abstract class Shape {

        private String name;

        public Shape(){
            setName(getClass().getSimpleName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public abstract double area();


        @Override
        public String toString() {
            return getClass().getSimpleName()+ "{" +
                    "name='" + name + '\'' +

                    '}';
        }
    }





