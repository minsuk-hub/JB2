package com.oliverdunk.jb2.exceptions;

/**
 * B2 API에서 반환하는 모든 오류를 나타내며, 클라이언트가 gracefully하게 실패할 수 있는 기능을 제공하기 위해 RuntimeException으로 던져집니다.
 */
public class B2APIException extends RuntimeException {

    private String errorMessage, identifier;
    private int statusCode;

    /**
     * 지정된 errorMessage로 새로운 B2APIException을 생성합니다.
     *
     * @param errorMessage 발생한 문제에 대한 오류 메시지
     */
    public B2APIException(String errorMessage){
        setErrorMessage(errorMessage);
    }

    /**
     * 이 예외의 상태 코드를 설정합니다.
     *
     * @param statusCode 이 예외로 표현된 B2 오류 상태
     */
    public void setStatusCode(int statusCode){
        this.statusCode = statusCode;
    }

    /**
     * 이 예외의 식별자를 설정합니다.
     *
     * @param identifier 이 예외로 표현된 B2 오류 코드
     */
    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }

    /**
     * 이 예외의 오류 메시지를 설정합니다.
     *
     * @param errorMessage 발생한 문제에 대한 오류 메시지
     */
    public void setErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }

    /**
     * 이 예외의 상태 코드를 반환합니다.
     *
     * @return 이 예외로 표현된 B2 오류 상태
     */
    public int getStatusCode(){
        return statusCode;
    }

    /**
     * 이 예외의 식별자를 반환합니다.
     *
     * @return 이 예외로 표현된 B2 오류 코드
     */
    public String getIdentifier(){
        return identifier;
    }

    /**
     * 이 예외의 오류 메시지를 반환합니다.
     *
     * @return 발생한 문제에 대한 오류 메시지
     */
    public String getErrorMessage(){
        return errorMessage;
    }

}
