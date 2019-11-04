/*********************************************************************************

1. Nearest Neighbor
A number of cities are arranged on a graph that has been divided up like an ordinary Cartesian plane. Each city is located at an integral (x, y) coordinate intersection. City names and locations are given in the form of three arrays: c, x, and y, which are aligned by the index to provide the city name (c[i]), and its coordinates, (x[i], y[i]). Determine the name of the nearest city that shares either an x or a y coordinate with the queried city. If no other cities share an x or y coordinate, return NONE. If two cities have the same distance to the queried city, q[i], consider the one with an alphabetically smaller name (i.e. 'ab' < 'aba' < 'abb') as the closest choice. The distance is denoted on a Euclidean plane: the difference in x plus the difference in y.



Example

 

n = 3

c = [c1, c2, c3] 

x = [ 3, 2, 1]

y = [3, 2, 3]

 

The three points at (x[i], y[i]) are (3,3), (2,2) and (1,3) represent the coordinates of the cities on the graph.  Make queries for q = [c1, c2, c3]. The nearest city to c1 is c3, which shares a y value (distance = (3-1) + (3-3) = 2). City c2 does not have a nearest city as none share an x or y with c2, so this query returns NONE. A query of c3 returns c1 based on the first calculation. The return array after all queries are complete is [c3, NONE, c1].

 

Function Description 

Complete the function closestStraightCity in the editor below. The function must return an array of m strings, where the index of i element of this array denotes the return value of the index of i query.

 

closestStraightCity has the following parameter(s):

    c string[]:  an array of strings that represent the names of each city[i]

    x int[]:  an array of integers, the x coordinate of each city[i]

    y int[]:  an array of integers, the y coordinate of each city[i]

    q int[]:  an array of strings, two dash-separated integers representing a query location

 

Constraints

1 ≤ n, m ≤ 105
1 ≤ x[i], y[i] ≤ 109
1 ≤ | q[i] |, | c[i] | ≤ 10
Each character of all c[i] and q[i] ∈ ascii[a-z, 0-9, -]
All city name values, c[i], are unique
All cities have unique coordinates
 

Input Format For Custom Testing
Sample Case 0
Sample Input 0

3
fastcity
bigbanana
xyz
3
23
23
23
3
1
10
20
3
fastcity
bigbanana
xyz
Sample Output 0

bigbanana
fastcity
bigbanana
Explanation 0

 



 

n = 3

c = [fastcity, bigbanana, xyz]

n = 3

x = [23, 23, 23]

n = 3

y = [1, 10, 20]

m = 3

q = [fastcity, bigbanana, xyz]

 

There are three cities in the input with the corresponding coordinates: fastcity = (23, 1), bigbanana = (23, 10), xyz = (23, 20). The distance between fastcity and bigbanana is 9, fastcity to xyz is 19, and bigbanana to xyz is 10. There are three queries to answer. The first of them asks for the closest city to fastcity, which has exactly one different coordinate. Both bigbanana and xyz have exactly one coordinate that differs from fastcity, but bigbanana is closer and is the correct answer. The second query asks for the closest direct city to bigbanana, and since fastcity is closer than xyz, the correct answer is fastcity. The third query asks for the closest direct city to xyz, and since bigbanana is closer than fastcity, the correct answer is bigbanana.

 




************************************************************************************/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'closestStraightCity' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY c
     *  2. INTEGER_ARRAY x
     *  3. INTEGER_ARRAY y
     *  4. STRING_ARRAY q
     */

    public static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {

        
         
        List<Integer> result = new ArrayList< >();
        List<Integer> dislist = new ArrayList< >();
        List<String> res = new ArrayList<String>();
         int temp=0,dis=0;
         int[] tempAr=new int[1000];
        for(int i=0;i<c.size();i++)
        {
            temp=0;
            for(int j=0;j<x.size();j++)
            {
                if(i==j)
                {

                }
                else{
                      if(x.get(i)==x.get(j)||y.get(i)==y.get(j))
                       {
                         dislist.add(dis(x.get(i),y.get(i),x.get(j),y.get(j))); 
                         System.out.println(c.get(i)+" dis "+ dis);
                         temp=1;
                       }
                       else{
                           dislist.add(0); 
                       }
                 }
           
            }
           
            if(temp==0)
            {
             res.add("None");
            //  System.out.println(c.get(i));
            }
            else{
            List<Double> disTemplist = new ArrayList<>(dislist);
            Collections.sort(disTemplist);
            int ind=disTemplist.size();   
            
            // res.add(c.get(dislist.indexOf(ind)));
            }

        }

     
return res;

    }
    public static int dis(
  int x1, 
  int y1, 
  int x2, 
  int y2) 
  {       
    double x = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    return x;

}

 

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> c = new ArrayList<>();

        for (int i = 0; i < cCount; i++) {
            String cItem = bufferedReader.readLine();
            c.add(cItem);
        }

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < xCount; i++) {
            int xItem = Integer.parseInt(bufferedReader.readLine().trim());
            x.add(xItem);
        }

        int yCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < yCount; i++) {
            int yItem = Integer.parseInt(bufferedReader.readLine().trim());
            y.add(yItem);
        }

        int qCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> q = new ArrayList<>();

        for (int i = 0; i < qCount; i++) {
            String qItem = bufferedReader.readLine();
            q.add(qItem);
        }

        List<String> result = Result.closestStraightCity(c, x, y, q);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
