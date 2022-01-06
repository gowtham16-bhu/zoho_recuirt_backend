config.action_mailer.default_url_options = { :host => 'springwithudata.herokuapp.com' }
config.action_mailer.delivery_method = :smtp
config.action_mailer.perform_deliveries = true
config.action_mailer.raise_delivery_errors = false
config.action_mailer.default :charset => "utf-8"
config.action_mailer.smtp_settings = {
  address: "smtp.gmail.com",
  port: 587,
  domain: "springwithudata.herokuapp.com",
  authentication: "plain",
  enable_starttls_auto: true,
  user_name:"techpiratesteam@gmail.com",
  password: "ugcvfloqlidvntdw"
}