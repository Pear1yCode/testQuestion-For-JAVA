package mbti;

import java.util.Scanner;

public class mbti {
    private static int CB; // CB ++ 신중함 , CB-- 용감함 / 신중함 = Cautious, 용감함 = Brave => 실제 mbti와 매칭을 해봤을 때 I와 E로 매칭이 가능하여 이해함에 도움이되는데 E인데도 여기서는 C가 나올 수 있기 때문에 다른점을 기대할 수 있다.
    private static int HG; // HG ++ 실체가 무섭다, HG -- 실체가 아닌게 무섭다/ H = Humna, G = Ghost => 실제 mbti에서 n과 s로 매칭이 가능하여 상상하는 n과 상상하지 않는 s로 나눈 것처럼 꽤나 유사하게 표현할 수 있을 것으로 전망한다.
    private static int SE; // SE ++ 무서운건 그 이상으로 무언가가 존재한다., SE -- 무서운건 그 이상도 이하도 아닐뿐 무서운 감정 뿐이다. / 공포는 그저 즐기기 위한 요소일뿐 그 이상도 이하도 아니다.
    private static int TM; // TM ++ 스릴이 좋다, TM -- 분위기가 좋다 / T = thrill, M = mood => p랑 j를 매칭했을때 계획적이지 않음과 계획적임을 미루어보아 스릴이 좋은 것도 나름 p와 j로 매칭이 가능하여 그냥 둬도 될 것으로 보인다.
    Scanner sc = new Scanner(System.in);

    public void answer() {
        String mbti = "";
        // CB 구분용
        while (true) {
            System.out.println("담력시험을 하기로 하여 폐가에서 하룻밤을 보내기로 했다.");
            System.out.println("그러던 중 갑작스러운 인기척에 잠에서 깼다.");
            System.out.println("어떻게 할까?");
            System.out.println("1. 그 자리에 숨어서 상황을 지켜본다.");
            System.out.println("2. 무기로 쓸만한 물건을 찾아 들고 나가서 확인한다.");
            System.out.print("당신의 선택은 ? : ");
            int answer = sc.nextInt();
            switch (answer) {
                case 1 : CB ++; break;
                case 2 : CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요"); continue;
            }
            break;
        }
        while (true) {
            System.out.println("집을 가는 길에 항상 지나가야하는 굴다리(OR 골목)가 있다.");
            System.out.println("오늘은 시간이 늦어 가로등도 꺼지고 불이 없는 상황이다.");
            System.out.println("이 길로 가지 않으면 10분을 돌아가야하는데 중간에 사람형체인지 모를 이상한 실루엣이 흔들거리고 있다.");
            System.out.println("돌아가야할까? 그냥 지나갈까?");
            System.out.println("1. 운동이나 할겸 돌아간다.");
            System.out.println("2. 무서울 것 없다. 그냥 간다.");
            System.out.print("당신의 선택은 ? : ");
            int answer02 = sc.nextInt();
            switch (answer02) {
                case 1 : CB ++; break;
                case 2 : CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요"); continue;
            }
            break;
        }
        while (true) {
            System.out.println("산에서 길을 잃고 휴대폰 배터리까지 떨어져 조난당했다.");
            System.out.println("야생동물이 나올 걱정은 없는 산이지만 어두워져 당장 좋지 않은 상황이다.");
            System.out.println("최근 심장마비로 알수없이 죽은 사람들이 있어 불안한데 근처에서 소름끼치는 흐느끼는 소리가 들린다.");
            System.out.println("다행히 조난신호를 보내놓아 구조대가 올 가능성이 있지만 당장은 아닌 상황이다. 어떡할까?");
            System.out.println("1. 소리가 나는 반대 방향으로 가거나 조난당한 위치에서 그대로 구조를 기다린다.");
            System.out.println("2. 소리가 나는 곳으로 가본다.");
            System.out.print("당신의 선택은 ? : ");
            int answer03 = sc.nextInt();
            switch (answer03) {
                case 1 : CB ++; break;
                case 2 : CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요"); continue;
            }
            break;
        }
        while (true) {
            System.out.println("외국에 놀러갔는데 옥수수 밭을 탐방하던 도중 옥수수 밭에서 조난당했다.");
            System.out.println("한도 끝도 없는 옥수수 밭에서 조난당했다고 신호는 보낸 상황인데 근처에서 신호를 보냄과 동시에 나한테 무언가 다가오는 소리가 들린다.");
            System.out.println("구조대가 아닌 것은 확실하지만 어떻게 할까?");
            System.out.println("1. 살짝 숨어서 무엇이 오는지 지켜본 뒤에 행동한다.");
            System.out.println("2. 누군지 불러본다.");
            System.out.print("당신의 선택은 ? : ");
            int answer04 = sc.nextInt();
            switch (answer04) {
                case 1 : CB ++; break;
                case 2 : CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요"); continue;
            }
            break;
        }
        while (true) {
            System.out.println("외국 여행 중 산에서 삐쩍 마른 곰을 발견했다.");
            System.out.println("아직 곰을 날 확인한 것은 아니지만 나를 발견하면 미친듯이 달려들 것 같은 예감이 든다.");
            System.out.println("다행히 호신용 총이 있지만 단 한발밖에 없다.");
            System.out.println("곰이 있는 곳으로 지나가지 않으면 하산할 수 없어 어두워지는 이 상황에 한시가 급하다.");
            System.out.println("어떻게 해야할까?");
            System.out.println("1. 조용히 숨을 죽인채 지나가길 기다린다.");
            System.out.println("2. 곰과 싸운다.");
            System.out.print("당신의 선택은 ? : ");
            int answer05 = sc.nextInt();
            switch (answer05) {
                case 1 : CB ++; break;
                case 2 : CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요"); continue;
            }
            break;
        }
        while (true) {
            System.out.println("납치를 당해 위험한 상황이다.");
            System.out.println("다행히 풀려있던 밧줄이 헐거워 풀 수 있었고 옆에서 무기를 찾을 수 있었다.");
            System.out.println("현재 바깥이 조용하고 새소리가 나는 것으로 보아 낮인 것 같다는 판단을 할 수 있었고");
            System.out.println("탈출시도를 하거나 여기서 기다렸다가 납치범이 돌아오면 습격을 할 수 있을 것 같다.");
            System.out.println("어떻게 할까?");
            System.out.println("1. 탈출을 시도한다.");
            System.out.println("2. 아직 있을지 모른다. 기다렸다가 기습한다.");
            System.out.print("당신의 선택은? : ");
            int answer06 = sc.nextInt();
            switch (answer06) {
                case 1 : CB --; break;
                case 2 : CB ++; break;
                default:
                    System.out.println("올바르게 입력해주세요."); continue;
            }
            break;
        }
        while (true) {
            System.out.println("시골이지만 드디어 내 집을 마련했다.");
            System.out.println("2층이나 되는 굉장히 넓은 집이다.");
            System.out.println("혼자 살고 있지만 나에게도 가족이 생기면 굉장히 소중한 집이 될 것 같다.");
            System.out.println("지금 시간은 오후 11시, 그 때 2층에서 이상한 소리가 들렸고 잘못들었다고 하기엔 굉장히 소름끼치는 소리었다.");
            System.out.println("어떻게 할까?");
            System.out.println("1. 설마 집에 누군가 들어왔겠어? 무기가 될만한 것을 찾아서 위로 올라가서 확인한다.");
            System.out.println("2. 아무리 생각해도 이건 무언가 침입한 것이다. 밖으로 도주한 뒤 안전한 곳에서 경찰에게 도움을 요청한다.");
            int answer07 = sc.nextInt();
            switch (answer07) {
                case 1 : CB --; break;
                case 2 : CB ++; break;
                default:
                    System.out.println("올바르게 입력해주세요."); continue;
            }
            break;
        }
        // HG 구분용
        while (true) {
            System.out.println("사람이 귀신보다 더 무섭다");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer2 = sc.nextInt();
            switch (answer2) {
                case 1:
                    HG++;
                    break;
                case 2:
                    HG--;
                    break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while(true) {
            System.out.println("집 침대밑이나 세탁기 안에 숨어있다면 더 무서운건 무엇일까?");
            System.out.println("1. 사람, 2. 괴물");
            System.out.print("당신의 선택은 ? : ");
            int answer3 = sc.nextInt();
            switch (answer3) {
                case 1: HG ++; break;
                case 2: HG --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while(true) {
            System.out.println("일주일동안 같은 꿈을 꿔야 하는데 선택해야 한다면?");
            System.out.println("1. 꿈에서 칼든 살인마가 쫓아오는 꿈");
            System.out.println("2. 물구나무 선 귀신이 팔로 쫓아오는 꿈");
            System.out.print("당신의 선택은 ? : ");
            int answer4 = sc.nextInt();
            switch (answer4) {
                case 1: HG ++; break;
                case 2: HG --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("담력시험을 하러 폐가에 갔을 때 더 무서운 것은?");
            System.out.println("1. 피와 사람의 흔적");
            System.out.println("2. 혼자서 움직이는 의자와 그네");
            System.out.print("당신의 선택은 ? : ");
            int answer5 = sc.nextInt();
            switch (answer5) {
                case 1: HG ++; break;
                case 2: HG --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("혼자 자취하고 있는 나는 오늘도 일을 마치고 집으로 돌아왔다.");
            System.out.println("모든 일을 마무리하고 내 방으로 들어왔을 때 침대 밑의 무언가와 눈이 마주쳤다.");
            System.out.println("그건 누굴까?");
            System.out.println("1. 사람, 2. 귀신");
            System.out.print("당신의 선택은 ? : ");
            int answer6 = sc.nextInt();
            switch (answer6) {
                case 1: HG ++; break;
                case 2: HG --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        // SE 구분
        while (true) {
            System.out.println("빙의는 허무맹랑한 지어낸 헛소문일 뿐이다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer001 = sc.nextInt();
            switch (answer001) {
                case 1 : BD--; break;
                case 2 : BD++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("귀신을 본적도 없고 믿지도 않는다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer002 = sc.nextInt();
            switch (answer002) {
                case 1 : BD --; break;
                case 2 : BD ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("가끔 무언가 영적인 존재가 있다고 느낀다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer003 = sc.nextInt();
            switch (answer003) {
                case 1 : BD ++; break;
                case 2 : BD --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("사람들이 헛것을 보는 것은 피곤해서가 아니라 실제로 귀신일 것이다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer004 = sc.nextInt();
            switch (answer004) {
                case 1 : BD ++; break;
                case 2 : BD --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("수호령이 있다는 말은 진짜다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer005 = sc.nextInt();
            switch (answer005) {
                case 1 : BD ++; break;
                case 2 : BD --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        // TM 구분
        while (true) {
            System.out.println("공포는 좋아하지만 점프스퀘어(갑툭튀)는 싫다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer = sc.nextInt();
            switch (tmAnswer) {
                case 1 : TM --; break;
                case 2 : TM ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("공포의 진정한 묘미는 시각적인 것 보다 청각적으로 더 많이 작용한다고 생각한다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer2 = sc.nextInt();
            switch (tmAnswer2) {
                case 1 : TM --; break;
                case 2 : TM ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("잔잔한 공포보다는 극단적인 공포가 좋다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer3 = sc.nextInt();
            switch (tmAnswer3) {
                case 1 : TM ++; break;
                case 2 : TM --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("두가지의 공포 영화 중 하나를 꼭 골라봐야 한다.");
            System.out.println("무엇을 볼까?");
            System.out.println("1. 귀신이야기");
            System.out.println("2. 살인마와의 추격전");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer4 = sc.nextInt();
            switch (tmAnswer4) {
                case 1 : TM --; break;
                case 2 : TM ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("귀신이 나온 직후보다 나오기 전을 더 즐긴다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer5 = sc.nextInt();
            switch (tmAnswer5) {
                case 1 : TM --; break;
                case 2 : TM ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        if (CB >= 1) {
            mbti += "C";
        } else if (CB <= -1) {
            mbti += "B";
        }
        if (HG >= 1) {
            mbti += "H";
        } else if (HG <= -1) {
            mbti += "G";
        }
        if (BD >= 1) {
            mbti += "B";
        } else if (BD <= -1) {
            mbti += "D";
        }
        if (TM >= 1) {
            mbti += "T";
        } else if (TM <= -1) {
            mbti += "M";
        }
        System.out.println(mbti);
        if(mbti.equals("CHBT")) {
            System.out.println("당신은 신중하고 사람이 더 무서우며 귀신을 믿는 공포스릴을 즐기는 사람");
        } else if (mbti.equals("CHBM")) {
            System.out.println("당신은 신중하고 사람이 더 무서우며 귀신을 믿는 공포분위기를 즐기는 사람");
        } else if (mbti.equals("CHDT")) {
            System.out.println("귀신을 믿지는 않지만 현실적인 공포 스릴이 좋아");
        } else if (mbti.equals("CHDM")) {
            System.out.println("당신은 신중하고 사람이 더 무서우며 귀신을 믿지 않지만 공포 분위기를 즐기는 사람");
        } else if (mbti.equals("CGBT")) {
            System.out.println("당신은 신중하고 귀신이 더 무서우며 귀신을 믿는 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("CGBM")) {
            System.out.println("당신은 신중하고 귀신이 더 무서우며 귀신을 믿는 공포 분위기를 즐기는 사람");
        } else if (mbti.equals("CGDT")) {
            System.out.println("당신은 신중하고 귀신을 더 무서워하지만 귀신을 믿지 않는 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("CGDM")) {
            System.out.println("당신은 신중하고 귀신을 더 무서워하지만 귀신을 믿지 않는 공포 분위기를 즐기는 사람");
        } else if (mbti.equals("BHBT")) {
            System.out.println("당신은 용감하고 사람을 더 무서워하지만 귀신을 믿는 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("BHBM")) {
            System.out.println("당신은 용감하고 사람을 더 무서워하지만 귀신을 믿는 공포 분위기를 즐기는 사람");
        } else if (mbti.equals("BHDT")) {
            System.out.println("당신은 용감하나 사람을 더 무서워하고 귀신을 믿지 않지만 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("BHDM")) {
            System.out.println("당신은 용감하나 사람을 더 무서워하고 귀신을 믿지 않지만 공포 분위기를 즐기는 사람 ");
        } else if (mbti.equals("BGBT")) {
            System.out.println("당신은 용감하나 귀신을 더 무서워하며 귀신을 믿고 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("BGBM")) {
            System.out.println("당신은 용감하나 귀신을 더 무서워하며 귀신을 믿고 공포 분위기를 즐기는 사람");
        } else if (mbti.equals("BGDT")) {
            System.out.println("당신은 용감하나 귀신을 더 무서워하지만 귀신을 믿지 않고 공포 스릴을 즐기는 사람");
        } else if (mbti.equals("BGDM")) {
            System.out.println("당신은 용감하나 귀신을 더 무서워하지만 귀신을 믿지 않고 공포 분위기를 즐기는 사람");
        }
    }
}
