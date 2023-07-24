package backjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
이번 문제의 경우, 기존의 Scanner 또는 System.out.println 항목 대신,BufferedReader, BufferedWriter 을 대신 사용하는 문제

BufferedReader
:Scanner와 유사.

Bufferedwriter
:System.out.println();과 유사

기존의 Scanner 또는 System.out.println 보다 속도 측면에서 훨씬 빠르다.
(입력된 데이터가 바로 전달되지 않는 대신, 버퍼를 거쳐서 전달 되므로 데이터 처리 효율성을 높인다.
따라서, 많은 양의 데이터를 처리할때 유리하다.)

하지만 그에 비해 BufferdReader은 Enter만 경계로 인식하고 받은 데이터가 
String으로 고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다. 
*/

public class bufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //BufferedWriter 선언
        int t = Integer.parseInt(br.readLine()); //기존의 scanner 항목처럼 몇번의 테스트 케이스를 진행할지.

        //반복문 설정
        for(int i=0; i<t; i++){
            int a = Integer.parseInt(br.readLine()); //int t 와 동일하게, 테스트 케이스인 A, B 숫자를 입력한다.
            int b = Integer.parseInt(br.readLine());

            int sum = a + b; //a와 b의 합을 sum이라 정한다.

            bw.write(sum + "\n"); //bufferedWriter의 경우 버퍼를 잡아 놓았기 때문에, 반드시 flush() / close()
            //이용하여 정리를 해야한다. 남은 데이터를 모두 출력 시키고, 스트림을 닫는 의미를 가지고 있다.

        }
        bw.flush(); // 남아있는 데이터를 모두 출력 시킴
        bw.close(); // 스트림을 닫음
    }
    
}
