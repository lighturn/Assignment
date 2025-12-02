import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Map<String, String> loginMap = new HashMap<>();

        try (Scanner fc = new Scanner(new File("db.txt"))) {
            while (fc.hasNextLine()) {
                String line = fc.nextLine().trim();
                String[] tokens = line.split("\\s+");
                if (tokens.length == 2) {
                    loginMap.put(tokens[0], tokens[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!loginMap.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String pw = sc.nextLine().trim();

            if (!loginMap.get(id).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
        }

    }
