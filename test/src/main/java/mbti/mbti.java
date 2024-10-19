package mbti;

import java.util.Scanner;

public class mbti {
    private static int CB; // CB ++ 신중함 , CB-- 용감함 / 신중함 = Cautious, 용감함 = Brave => 실제 mbti와 매칭을 해봤을 때 I와 E로 매칭이 가능하여 이해함에 도움이되는데 E인데도 여기서는 C가 나올 수 있기 때문에 다른점을 기대할 수 있다.
    private static int HG; // HG ++ 실체가 무섭다, HG -- 실체가 아닌게 무섭다/ H = Humna, G = Ghost => 실제 mbti에서 n과 s로 매칭이 가능하여 상상하는 n과 상상하지 않는 s로 나눈 것처럼 꽤나 유사하게 표현할 수 있을 것으로 전망한다.
    private static int SE; // SE ++ 무서운건 그 이상으로 무언가가 존재한다. (Scary), SE -- 무서운건 그 이상도 이하도 아닐뿐 무서운 감정 뿐이다. (Enjoy) / 공포는 그저 즐기기 위한 요소일뿐 그 이상도 이하도 아니다.
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
            System.out.print("당신의 선택은 ? : ");
            int answer07 = sc.nextInt();
            switch (answer07) {
                case 1 : CB --; break;
                case 2 : CB ++; break;
                default:
                    System.out.println("올바르게 입력해주세요."); continue;
            }
            break;
        }
        while (true) {
            System.out.println("나는 산행을 좋아하여 국내 산행은 모두 마치고 외국에 있는 모든 산행을 하기 마음먹어 여행을 다니고 있다.");
            System.out.println("오늘은 산이 너무 험해 길을 잃고 말았다.");
            System.out.println("그러나 다행히 산 중턱에서 우거진 숲속에 둘러쌓여진 오두막을 발견했고 겉으로 보기에는 최근까지 누군가가 살았던 흔적이 있다.");
            System.out.println("불안한 점은 일반적인 오두막이라기보다는 무언가를 잡는 곳이었다는 느낌이 강하고 일부러 이 안쪽에 지어놓았다는 직감이 들었다.");
            System.out.println("해가 지기 직전이라서 그냥 갔다가는 야생동물 등의 위험에 노출될 것이다.");
            System.out.println("어떻게 할까?");
            System.out.println("1. 그냥 일을 위해 사용하던 오두막일 것이다. 입구에서 주인을 기다리거나 오두막에 들어가본다. (숨어서 지켜볼 수 있는 방법도 있다.)");
            System.out.println("2. 무슨 일이 있을지 모르는데 해가 지더라도 더 길을 찾아 나아가본다.");
            System.out.print("당신의 선택은 ? : ");
            int answer08 = sc.nextInt();
            switch (answer08) {
                case 1 :
                    CB --; break;
                case 2 :
                    CB ++; break;
                default:
                    System.out.println("올바르게 입력해주세요."); continue;
            }
            break;
        }
        while (true) {
            System.out.println("뒤에서 누군가 쫓아오고 있다.");
            System.out.println("뛰어서 도망가고 있지만 점점 숨이 차는 상황이다.");
            System.out.println("측면 모퉁이를 돌았을 때 내가 할 행동은?");
            System.out.println("1. 모퉁이의 숨을 공간을 찾아 재빨리 들어간다.");
            System.out.println("2. 모퉁이를 돌아 쓰레기 더미에서 무기를 찾아 추격자를 기다렸다가 습격한다.");
            System.out.print("당신의 선택은 ? : ");
            int answer09 = sc.nextInt();
            switch (answer09) {
                case 1 :
                    CB ++; break;
                case 2 :
                    CB --; break;
                default:
                    System.out.println("올바르게 입력해주세요."); continue;
            }
            break;
        }
        // HG 구분용
        while (true) {
            System.out.println("1000평짜리 5층 집에서 일주일만 이것과 함께 살면 100억을 준다고 한다.");
            System.out.println("집이 매우 넓어서 충분히 숨을 수 있을 것 같다.");
            System.out.println("어떤 것과 같이 살까?");
            System.out.println("1. 귀신");
            System.out.println("2. 살인마");
            System.out.print("당신의 선택은 ? : ");
            int answer1 = sc.nextInt();
            switch (answer1) {
                case 1 :
                    HG++; break;
                case 2 :
                    HG--; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
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
            System.out.println("그건 무엇이었을까?");
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
        while (true) {
            System.out.println("1. 살인마와 1층에서 10층까지 추격전찍기");
            System.out.println("2. 귀신이랑 하룻동안 엘레베이터에 갇혀서 데이트하기");
            System.out.print("당신의 선택은 ? : ");
            int answer7 = sc.nextInt();
            switch (answer7) {
                case 1 : HG --; break;
                case 2 : HG ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("1. 살인마 뿐만 아니라 귀신도 나에게 해를 입힐 수 있다.");
            System.out.println("2. 귀신은 나에게 해를 입힐 수 없다. 사람만 조심하면 된다.");
            System.out.print("당신의 선택은 ? : ");
            int answer8 = sc.nextInt();
            switch (answer8) {
                case 1 : HG ++; SE ++; break;
                case 2 : HG --; SE --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("눈을 감고 머리를 감을 때 눈을 뜰 수 없는 상황에서 앞에서 무언가 느껴진다.");
            System.out.println("무엇이 상상되는가?");
            System.out.println("1. 귀신");
            System.out.println("2. 괴물");
            System.out.print("당신의 선택은 ? : ");
            int answer9 = sc.nextInt();
            switch (answer9) {
                case 1 : HG ++; break;
                case 2 : HG --; break;
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
                case 1 : SE--; break;
                case 2 : SE++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("공포는 도파민을 위한 수단일 뿐 그 이상도 이하도 아니다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer002 = sc.nextInt();
            switch (answer002) {
                case 1 : SE --; break;
                case 2 : SE ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("귀신을 봤다는 것은 그저 피곤하거나 헛것을 본 것일 뿐 의미부여 할 필요 없다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer003 = sc.nextInt();
            switch (answer003) {
                case 1 : SE --; break;
                case 2 : SE ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("사람에게는 기라는 것이 존재한다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer004 = sc.nextInt();
            switch (answer004) {
                case 1 : SE ++; break;
                case 2 : SE --; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("정말 오래된 건물이 있다");
            System.out.println("해당 건물은 저주받았다는 소문에 아무도 가지 않는다.");
            System.out.println("심지어 폐가가 된 지 엄청나게 오래됐다.");
            System.out.println("그 건물에 들어가면 저주받는다는 소문이 있는데");
            System.out.println("가서 하룻밤만 자고오면 갔다오고 한달 뒤에 1억을 준다고한다.");
            System.out.println("한달 뒤라는 말이 찝찝하긴 하지만 1억이 수중에 들어온다고 생각하니 고민된다.");
            System.out.println("어떻게 할까?");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer005 = sc.nextInt();
            switch (answer005) {
                case 1 : SE --; break;
                case 2 : SE ++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("나는 미신을 믿는다.");
            System.out.println("예시) 의자를 빼놓고 자면 의자에 귀신이 앉아서 지켜본다.");
            System.out.println("예시) 문을 닫거나 제대로 열지 않고 틈을 만들어 놓으면 틈새로 무언가 지켜본다.");
            System.out.println("예시) 베개를 세워놓으면 부모님이 일찍 돌아가신다.");
            System.out.println("예시) 다리를 떨면 복이 떨어진다. -> 실제로는 좋은 효과밖에 없음");
            System.out.println("혹은 미신으로 인한 강박증을 갖고있다.");
            System.out.println("이에 동의하는가?");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int answer006 = sc.nextInt();
            switch (answer006) {
                case 1 : SE ++; break;
                case 2 : SE --; break;
                default:
                    System.out.println("올바른 번호를 입력해주세요."); continue;
            }
            break;
        }
        while (true) {
            System.out.println("우리나라에서 진행하는 굿과 외국에서 하는 퇴마의식 등을 보았을 때");
            System.out.println("분명 무언가 존재하는 것이기 때문에 나는 이러한 의식을 믿는다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.println("당신의 선택은 ? : ");
            int answer007 = sc.nextInt();
            switch (answer007) {
                case 1 : SE ++; break;
                case 2 : SE --; break;
                default:
                    System.out.println("올바른 번호를 입력해주세요."); continue;
            }
            break;
        }
        while (true) {
            System.out.println("집을 구매하려고 하는데 두개의 매물이 있다.");
            System.out.println("무엇을 선택할까?");
            System.out.println("1. 소문이 안좋고 저주받았다는 소문의 아무도 살지 않아온 100평의 집");
            System.out.println("2. 아무 문제없지만 비싼 25평의 집");
            System.out.println("참고로 1번 집은 이전 주인이 실종됐고 새로 들어온 주인도 실종됐다는 이야기가 있다.");
            System.out.print("당신의 선택은 ? : ");
            int answer008 = sc.nextInt();
            switch (answer008) {
                case 1 : SE --; break;
                case 2 : SE ++; break;
                default:
                    System.out.println("올바른 번호를 입력해주세요."); continue;
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
        while (true) {
            System.out.println("공포라는 장르에서 BGM이 없이 무섭게 만드는 것은 불가능에 가깝다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer6 = sc.nextInt();
            switch (tmAnswer6) {
                case 1 : TM--; break;
                case 2 : TM++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("점프스퀘어(갑툭튀)에서 사람을 놀라게 하는 요소는");
            System.out.println("청각적인 요소보다 시각적인 요소이다.");
            System.out.println("1. 예, 2. 아니오");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer7 = sc.nextInt();
            switch (tmAnswer7) {
                case 1 : TM--; break;
                case 2 : TM++; break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("1. 진정한 공포게임의 명작이라함은 분위기의 연출이다.");
            System.out.println("2. 진정한 공포게임은 분위기 뿐만 아니라 시각적인 뛰어남이 필요하다.");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer8 = sc.nextInt();
            switch (tmAnswer8) {
                case 1 : TM--; break;
                case 2 : TM++; break;
                default:
                    System.out.println("올바르게 입력해주세요");
                    continue;
            }
            break;
        }
        while (true) {
            System.out.println("1. 공포 장르는 영화든 게임이든 스토리가 더 중요하다.");
            System.out.println("2. 공포 장르는 영화든 게임이든 무서운게 더 중요하다.");
            System.out.print("당신의 선택은 ? : ");
            int tmAnswer9 = sc.nextInt();
            switch (tmAnswer9) {
                case 1 : TM--; break;
                case 2 : TM++; break;
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
        if (SE >= 1) {
            mbti += "S";
        } else if (SE <= -1) {
            mbti += "E";
        }
        if (TM >= 1) {
            mbti += "T";
        } else if (TM <= -1) {
            mbti += "M";
        }
        System.out.println(mbti);
        if(mbti.equals("CHET")) {
            System.out.println("성향 : 신중 | 두려움 : 사람 | 공포 : 즐김 | 선호 : 공포스릴");
        } else if (mbti.equals("CHEM")) {
            System.out.println("성향 : 신중 | 두려움 : 사람 | 공포 : 즐김 | 선호 : 공포분위기");
        } else if (mbti.equals("CHST")) {
            System.out.println("성향 : 신중 | 두려움 : 사람 | 공포 : 진지 | 선호 : 공포스릴");
        } else if (mbti.equals("CHSM")) {
            System.out.println("성향 : 신중 | 두려움 : 사람 | 공포 : 진지 | 선호 : 공포분위기");
        } else if (mbti.equals("CGST")) {
            System.out.println("성향 : 신중 | 두려움 : 귀신 | 공포 : 진지 | 선호 : 공포스릴");
        } else if (mbti.equals("CGSM")) {
            System.out.println("성향 : 신중 | 두려움 : 귀신 | 공포 : 진지 | 선호 : 공포분위기");
        } else if (mbti.equals("CGET")) {
            System.out.println("성향 : 신중 | 두려움 : 귀신 | 공포 : 즐김 | 선호 : 공포스릴람");
        } else if (mbti.equals("CGEM")) {
            System.out.println("성향 : 신중 | 두려움 : 귀신 | 공포 : 즐김 | 선호 : 공포분위기");
        } else if (mbti.equals("BHST")) {
            System.out.println("성향 : 용감 | 두려움 : 사람 | 공포 : 진지 | 선호 : 공포스릴");
        } else if (mbti.equals("BHSM")) {
            System.out.println("성향 : 용감 | 두려움 : 사람 | 공포 : 진지 | 선호 : 공포분위기");
        } else if (mbti.equals("BHET")) {
            System.out.println("성향 : 용감 | 두려움 : 사람 | 공포 : 즐김 | 선호 : 공포스릴");
        } else if (mbti.equals("BHEM")) {
            System.out.println("성향 : 용감 | 두려움 : 사람 | 공포 : 즐김 | 선호 : 공포분위기");
        } else if (mbti.equals("BGST")) {
            System.out.println("성향 : 용감 | 두려움 : 귀신 | 공포 : 진지 | 선호 : 공포스릴");
        } else if (mbti.equals("BGSM")) {
            System.out.println("성향 : 용감 | 두려움 : 귀신 | 공포 : 진지 | 선호 : 공포분위기");
        } else if (mbti.equals("BGET")) {
            System.out.println("성향 : 용감 | 두려움 : 귀신 | 공포 : 즐김 | 선호 : 공포스릴");
        } else if (mbti.equals("BGEM")) {
            System.out.println("성향 : 용감 | 두려움 : 귀신 | 공포 : 즐김 | 선호 : 공포분위기");
        }
    }
}
