package LecW2;

public class Account {
    protected boolean isSaving;
    protected boolean isCurrent;
    protected String accountNumber;

    public Account(String accountNumber, boolean isSaving, boolean isCurrent) {
        this.accountNumber = accountNumber;
        this.isSaving = isSaving;
        this.isCurrent = isCurrent;
    }

    public boolean isSaving() {
        return isSaving;
    }

    public void setSaving(boolean saving) {
        isSaving = saving;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    public String getAccountNumber() {
//        if (accountNumber.length() == 11);
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}

