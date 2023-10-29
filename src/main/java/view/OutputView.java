package view;

import static util.Messages.RUN_RESULT;

/**
 * packageName    : view
 * fileName       : OutputView
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-26        qkrtn_ulqpbq2       최초 생성
 */
public class OutputView {
    public static void printException(Exception exception) {
        System.out.println(exception.getMessage());
    }

    public static void printResultMessage() {
        System.out.println(RUN_RESULT);
    }
}
