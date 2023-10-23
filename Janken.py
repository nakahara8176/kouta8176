# じゃんけんゲーム　これはテストです by小澤　これもテストです　by古田
class Janken():

    def action():

        import random
        
        print('じゃんけんゲーム')

        # 勝った回数、負けた回数、引き分けた回数
        win_no = lose_no = draw_no = 0

        while True:
            comp = random.randint(0, 2)

            while True:
                human = int(input('じゃんけんポン(0：グー／1：チョキ／2:パー）：'))
                if 0 <= human <= 2:
                    break

            print('私は', end='')
            if comp == 0:
                print('グー', end='')
            elif comp == 1:
                print('チョキ', end='')
            else:
                print('パー', end='')
            print('です。')

            # 勝敗の判定
            judge = (human - comp + 3) % 3

            if judge == 0:
                print('引き分けです。')
                draw_no += 1
            elif judge == 1:
                print('あなたの負けです。')
                lose_no += 1
            else:
                print('あなたの勝ちです。')
                win_no += 1

            retry = int(input('もう一度(0：はい／1：いいえ）：'))
            if retry == 1:
                break

        print('成績：', win_no, '勝', lose_no, '敗', draw_no, '分けでした。')
        print('---------------じゃんけん　END---------------')
