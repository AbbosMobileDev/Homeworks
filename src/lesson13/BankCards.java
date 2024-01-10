package lesson13;

public enum BankCards {
    UZCARD()
            {
                @Override
                public void showInfo() {
                    System.out.println("Siz UZCARD tanladingiz");
                }},

                HUMO()
            {
                @Override
                public void showInfo() {
                    System.out.println("Siz HUMO tanladingiz");
                }
            },VISA()
            {
                @Override
                public void showInfo() {
                    System.out.println("Siz VISA tanladingiz");
                }
            },MASTER()
            {
                @Override
                public void showInfo() {
                    System.out.println("Siz MASTER tanladingiz");
                }
            };
            public abstract void showInfo();
}
