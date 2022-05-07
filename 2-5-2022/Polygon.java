import java.util.*;
public class PolygongetPolygon{
public Polygon getPolygon(int numberOfSides){
if (numberOfSides==3){
return new Triangle();
}
if (numberOfSides==4){
return new Square();
}
if (numberOfSides==5){
return new Pentagon();
}
if (numberOfSides==7){
return new Heptagon();
}
else if (numberOfSides== 8){
return new Octogon();
}
return null;
}}