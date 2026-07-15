public class CurrentAccount extends Account {

    // extra field: overdraftLimit (double) — যেমন 500, মানে balance -500 পর্যন্ত যেতে পারবে
    // constructor লিখো, super(accountNumber, holderName, balance) call করো, overdraftLimit সেট করো

    // getAccountType() override করো — return "Current"

    // applyMonthlyEffect() override করো
    // — একটা ছোট maintenance fee (যেমন 10) balance থেকে কেটে নতুন balance রিটার্ন করো
}
