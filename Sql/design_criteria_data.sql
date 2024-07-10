create table if not exists design_criteria_data(
criteria_code varchar(255) not null,
criteria_name varchar(255) null,
local_infra varchar(255) null,
trade_infra varchar(255) null,
short_description varchar(255) null,
multi_criteria_option varchar(255) null,
criteria_params varchar(255) null,
upload_version Integer null,
launch_infra varchar(255) null,
manage_infra varchar(255) null,
status varchar(255) null,
constraint design_criteria_data_pk primary key(criteria_code));