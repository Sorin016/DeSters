package ru;



    class PaymentException extends Exception {
        public PaymentException(String message) {
            super(message);
        }
    }

    class PaymentService {
        public void processPayment(double amount) throws PaymentException {
            if (amount <= 0) {
                throw new PaymentException("Invalid payment amount: " + amount);
            }
        }
    }

    public class trycat {
        public static void main(String[] args)  {
            PaymentService paymentService = new PaymentService();
            try {
                paymentService.processPayment(-100); // This should throw a PaymentException
            } catch (PaymentException e) {
                throw new RuntimeException(e);
            }

        }
    }

