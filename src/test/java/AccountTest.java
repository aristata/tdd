import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private static Account account;

    @BeforeAll
    public static void setup() {
        account = new Account(10000);
    }

    /**
     * 계좌 생성 테스트
     */
    @Test
    public void testAccount() {
        setup();
    }

    /**
     * 잔고 조회 테스트
     * - 10000, 1000, 0 으로 계좌 생성
     * - 잔고 조회 후 결과 일치 확인
     */
    @Test
    public void testGetBalance() {
        setup();
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    /**
     * 입금 테스트
     * - 10000원으로 계좌 생성
     * - 1000원 입금
     * - 잔고 11000원 확인
     */
    @Test
    public void testDeposit() {
        setup();
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    /**
     * 출금 테스트
     * - 10000원으로 계좌 생성
     * - 1000원 출금
     * - 잔고 9000원 확인
     */
    @Test
    public void testWithdraw() {
        setup();
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
}
